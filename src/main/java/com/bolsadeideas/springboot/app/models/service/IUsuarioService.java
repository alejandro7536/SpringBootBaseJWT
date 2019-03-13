package com.bolsadeideas.springboot.app.models.service;

import java.util.List;

import com.bolsadeideas.springboot.app.models.entity.Menu;
import com.bolsadeideas.springboot.app.models.entity.Role;
import com.bolsadeideas.springboot.app.models.entity.Usuario;

public interface IUsuarioService {
	
	public Role getRole(Long id);
	
	public Usuario findOne(Long id);
	
	public List<Menu> menus(String username);
	
	public void saveCliente(Usuario usuario);

}

