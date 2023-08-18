package br.com.imobApp.imobAppWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.imobApp.imobAppWeb.dtos.CadastrarImobiliariaRequestDTO;
import br.com.imobApp.imobAppWeb.dtos.ImobiliariaDTO;
import br.com.imobApp.imobAppWeb.dtos.ResponseListaImobiliariasDTO;
import br.com.imobApp.imobAppWeb.services.ImobiliariaService;

@RestController
@RequestMapping(value="api/v1/imobiliarias")
public class ImobiliariaController {
	
	@Autowired
	private ImobiliariaService imobiliariaService;
	
	@GetMapping
	public ResponseListaImobiliariasDTO listaImobiliarias() {
		return null;

	}
	
	@PostMapping
	public ResponseEntity<ImobiliariaDTO> cadastrarImobiliaria(@RequestBody CadastrarImobiliariaRequestDTO request) {

		ImobiliariaDTO response = imobiliariaService.cadastrarImobiliaria(request);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
				
	}
	
	
	

}
