package com.bolsadeideas.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.app.models.entity.Role;
import com.bolsadeideas.springboot.app.models.entity.Usuario;

@Service("jpaUserDetailService")
public class JpaUserDetailService implements UserDetailsService {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	private Logger logger = LoggerFactory.getLogger(JpaUserDetailService.class);

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByUsername(username);
		
		if(usuario == null) {
			logger.error("Error login: no eiste el usuario  '" + username + "'");
			throw new UsernameNotFoundException("Username " + username + " no existe ");
		}

		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();

		Role role = usuario.getRol();

		authorities.add(new SimpleGrantedAuthority(role.getAuthority()));

		
		
		if(authorities.isEmpty()) {
			logger.error("Error login: no eiste el usuario  '" + username + "' no tiene roles asignados");
			throw new UsernameNotFoundException("Username " + username + " no tiene roles ");
		}

		return new User(usuario.getUsername(), usuario.getPassword(), usuario.isEnabled(), true, true, true,
				authorities);
	}

}
