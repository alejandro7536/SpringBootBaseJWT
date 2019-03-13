package com.bolsadeideas.springboot.app.auth.service;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.auth.SimpleGrantedAuthoritiesMixin;
import com.bolsadeideas.springboot.app.models.entity.Menu;
import com.bolsadeideas.springboot.app.models.service.IUsuarioService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JWTServiceImpl implements JWTService{
	
	@Autowired
	private IUsuarioService usuarioService;
	
	public static final SecretKey secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
	public static final long EXPIRATION_DATE = 14000000L;

	
	@Override
	public String create(Authentication auth) throws JsonProcessingException {
		
		String username = ((User) auth.getPrincipal()).getUsername();
		Collection<? extends GrantedAuthority> roles = auth.getAuthorities();
		Claims claims = Jwts.claims();
		claims.put("authorities", new ObjectMapper().writeValueAsString(roles));
		
		String token = Jwts.builder()
				.setClaims(claims)
				.setSubject(username)
				.signWith(secretKey)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_DATE ))
				.compact();
		return token;
	}

	@Override
	public boolean validate(String token) {

		try {
			
		getClaims(token);
			return true;
			
		} catch (JwtException  | IllegalArgumentException e) {
			
			return false; 
		}
		
	}

	@Override
	public Claims getClaims(String token) {
		Claims claims=	Jwts.parser()//validar el token con la clave secreta
				.setSigningKey(secretKey)
				.parseClaimsJws(resolveToken(token))
				.getBody();
			
				return claims;
	}

	@Override
	public String getUsername(String token) {
		// TODO Auto-generated method stub
		return getClaims(token).getSubject();
	}

	@Override
	public Collection<? extends GrantedAuthority> getRoles(String token) throws IOException {
		
		Object roles = getClaims(token).get("authorities");
		
		Collection<? extends GrantedAuthority> authorities = Arrays.asList( new ObjectMapper()
				.addMixIn(SimpleGrantedAuthority.class, SimpleGrantedAuthoritiesMixin.class)
				.readValue(roles.toString().getBytes(), SimpleGrantedAuthority[].class));
		
		return authorities;
	}

	@Override
	public String resolveToken(String token) {
		if (token != null && token.startsWith("Bearer ")) {

			return token.replace("Bearer ", "");
		}
		
		return null;
	}

	@Override
	@Transactional
	public List<Menu> getMenu(String username) {
		return usuarioService.menus(username);
	}


	
	

}
