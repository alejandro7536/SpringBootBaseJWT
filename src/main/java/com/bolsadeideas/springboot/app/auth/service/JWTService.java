package com.bolsadeideas.springboot.app.auth.service;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import com.bolsadeideas.springboot.app.models.entety.Menu;

import io.jsonwebtoken.Claims;

public interface JWTService {
	
	public String create(Authentication auth) throws IOException;
	public boolean validate(String token);
	public Claims getClaims(String token);
	public String getUsername(String token);
	public Collection<? extends GrantedAuthority> getRoles(String token)throws IOException;
	public String resolveToken(String token);
	public List<Menu> getMenu(String username);
	
	
	
	

}
