package com.bolsadeideas.springboot.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bolsadeideas.springboot.app.models.entety.Cliente;
import com.bolsadeideas.springboot.app.models.entety.Menu;
import com.bolsadeideas.springboot.app.models.entety.Role;
import com.bolsadeideas.springboot.app.models.entety.Usuario;
import com.bolsadeideas.springboot.app.models.service.IClienteService;
import com.bolsadeideas.springboot.app.models.service.IUsuarioService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/listar")
	@Secured("ROLE_ADMIN")
	public List<Cliente> listarRest() {
		
		return clienteService.findAll();

	}
	
	@GetMapping("/roles/{id}")
	public List<Role> listarRoles(@PathVariable(value = "id") Long id){
		return usuarioService.getRoles(id);
	}
	
	@GetMapping("/user/{id}")
	public Usuario getUsuario(@PathVariable(value = "id") Long id) {
		return usuarioService.findOne(id);
	}
	
	@GetMapping("/menu/{username}")
	public List<Menu> getMenu(@PathVariable (value ="username") String username){
		return usuarioService.menus(username);
	}

}
