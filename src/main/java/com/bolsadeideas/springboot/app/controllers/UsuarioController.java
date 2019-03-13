package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entity.Menu;
import com.bolsadeideas.springboot.app.models.entity.Role;
import com.bolsadeideas.springboot.app.models.entity.Usuario;
import com.bolsadeideas.springboot.app.models.service.IUsuarioService;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/roles/{id}")
	public Role listarRol(@PathVariable(value = "id") Long id){
		return usuarioService.getRole(id);
	}
	
	@GetMapping("/{id}")
	public Usuario getUsuario(@PathVariable(value = "id") Long id) {
		return usuarioService.findOne(id);
	}
	
	@GetMapping("/menu/{username}")
	public List<Menu> getMenu(@PathVariable (value ="username") String username){
		return usuarioService.menus(username);
	}
	
	@PostMapping(value = "/config")
	@ResponseStatus(HttpStatus.CREATED)
	public void saveCliente(@RequestBody Usuario usuario) {
		usuarioService.saveCliente(usuario);		
	}

}
