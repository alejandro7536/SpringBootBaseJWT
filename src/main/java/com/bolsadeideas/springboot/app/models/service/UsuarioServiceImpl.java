package com.bolsadeideas.springboot.app.models.service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.app.models.dao.IUsuarioDao;
import com.bolsadeideas.springboot.app.models.entety.Menu;
import com.bolsadeideas.springboot.app.models.entety.Role;
import com.bolsadeideas.springboot.app.models.entety.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public List<Role> getRoles(Long id) {

		Usuario user = usuarioDao.findById(id).orElse(null);
		List<Role> roles = new ArrayList<>();

		roles = user.getRoles();

		return roles;
	}

	@Override
	public Usuario findOne(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public List<Menu> menus(String username) {

		List<Role> roles = new ArrayList<>();
		List<Menu> menu = new ArrayList<>();
		List<Menu> menuAux = new ArrayList<>();
		
		Usuario user = usuarioDao.findByUsername(username);

		roles = this.getRoles(user.getId());

		for (int i = 0; i < roles.size(); i++) {
			menuAux = roles.get(i).getMenus();
			
			if(menuAux != null) {
				for (int j = 0; j < menuAux.size(); j++) {
					menu.add(menuAux.get(j));
				}
			}
		}

		return menu;
		
	}

}
