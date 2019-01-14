package com.bolsadeideas.springboot.app.controllers;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login(@RequestParam(value="error", required = false) String error,
			@RequestParam(value="logout", required = false) String logout,
			Model model, Principal principal, RedirectAttributes flash) {
		
		if (principal != null) {
			
			flash.addFlashAttribute("info", "Ya tienes sesion iniciada");
			return "redirect:/";
		}
		
		boolean help = false;
		if(error != null) {
			help = true;
			model.addAttribute("error", "Credenciales incorrectas, intente de nuevo");
			model.addAttribute("help", help);
			
			
			
		}
		
		if(logout != null) {
			model.addAttribute("success", "Sesion cerrada con exito");
		}
		
		
		return "login";
		
	}
}
