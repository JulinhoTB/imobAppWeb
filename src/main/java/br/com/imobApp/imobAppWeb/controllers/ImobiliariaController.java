package br.com.imobApp.imobAppWeb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imobApp.imobAppWeb.dtos.ResponseListaImobiliariasDTO;

@RestController
@RequestMapping (value="/imobiliarias")
public class ImobiliariaController {
		
	@GetMapping
	public ResponseListaImobiliariasDTO listaImobiliarias() {
		return null;
		
		
	}
	
	

}
