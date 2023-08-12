package br.com.imobApp.imobAppWeb.imoveis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imobApp.imobAppWeb.imoveis.dto.ResponseListaImoveisDTO;


@RestController
@RequestMapping (value="/imoveis")
public class imovelController {

	@GetMapping
	public ResponseListaImoveisDTO listaImobiliarias() {
		return null;
		
		
	}
	
	
}
