package com.edwin.holamundo.holamundo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicial( Model mol) {
		
		String mensaje = "Hola desde el controlador!!";
		mol.addAttribute("Saludo", mensaje);
		
		return "index";
		
	}

}
