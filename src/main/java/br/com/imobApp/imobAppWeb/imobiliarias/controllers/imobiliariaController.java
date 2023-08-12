package br.com.imobApp.imobAppWeb.imobiliarias.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imobApp.imobAppWeb.imobiliarias.dto.ResponseListaImobiliariasDTO;

@RestController
@RequestMapping (value="/imobiliarias")
public class imobiliariaController {
		
	@GetMapping
	public ResponseListaImobiliariasDTO listaImobiliarias() {
		return null;
		
		
	}
	
	

}
