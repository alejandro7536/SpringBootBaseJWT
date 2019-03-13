package com.bolsadeideas.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.app.models.entity.Menu;
import com.bolsadeideas.springboot.app.models.entity.Role;
import com.bolsadeideas.springboot.app.models.entity.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;




	@Override
	public Usuario findOne(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public List<Menu> menus(String username) {

		List<Menu> menu;
		
		Usuario user = usuarioDao.findByUsername(username);

		Role rol = this.getRole(user.getId());

		menu = rol.getMenus();

		return menu;
		
	}

	@Override
	@Transactional
	public void saveCliente(Usuario usuario) {
		
		String password = usuario.getPassword();
		String bcryptPassword = passwordEncoder.encode(password);
		
		usuario.setPassword(bcryptPassword);
		
		usuarioDao.save(usuario);
		
	}

	@Override
	public Role getRole(Long id) {
		Usuario user = usuarioDao.findById(id).orElse(null);
		
		return user.getRol();
	}

}
