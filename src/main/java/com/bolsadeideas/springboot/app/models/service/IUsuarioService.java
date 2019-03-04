package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entety.Menu;
import com.bolsadeideas.springboot.app.models.entety.Role;
import com.bolsadeideas.springboot.app.models.entety.Usuario;

public interface IUsuarioService {
	
	public List<Role> getRoles(Long id);
	
	public Usuario findOne(Long id);
	
	public List<Menu> menus(String username);

}

