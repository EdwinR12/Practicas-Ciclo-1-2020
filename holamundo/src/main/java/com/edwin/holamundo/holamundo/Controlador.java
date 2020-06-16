package com.edwin.holamundo.holamundo;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.edwin.holamundo.Model.persona;

@Controller
public class Controlador {

	@GetMapping("/")
	public String Inicial( Model mol) {
		
		persona per = new persona();
		per.setNombre("Edwin");
		per.setApellido("Rivas");
		per.setTelefono("7840-7015");
	    per.setEmail("rm0483032018@unab.edu.sv");
	    
		persona per2 = new persona();
		per2.setNombre("Oswaldo");
		per2.setApellido("Menjivar");
		per2.setTelefono("7890-6014");
	    per2.setEmail("rm0483032020@unab.edu.sv");
	    
	  List personas = (List) Arrays.asList(per,per2);
		
		//String mensaje = "Hola ,Que tal!! jaja XDXD";
		
		//mol.addAttribute("Saludo", mensaje);
		//mol.addAttribute("persona",per);
		mol.addAttribute("personas",personas);
	
		
		
		return "index";
		
	}

}
