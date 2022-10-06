package com.jdavid.app.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8080/api/categorias
@RestController
@RequestMapping("/api/categorias")
public class CategoriaControlador {
	
	//HTPP: GET
	@GetMapping("/listar")
	public String listar() {
		return "listado de categorias";
		
	}
	

}
