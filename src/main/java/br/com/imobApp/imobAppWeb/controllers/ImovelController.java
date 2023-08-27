package br.com.imobApp.imobAppWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

import br.com.imobApp.imobAppWeb.comum.exceptions.ImobiliariaNotFoundException;
import br.com.imobApp.imobAppWeb.dtos.ImovelDTO;
import br.com.imobApp.imobAppWeb.services.ImovelService;

@RestController
@RequestMapping (value="api/v1/imoveis")
public class ImovelController {
	
	@Autowired
	private ImovelService imovelService;
		
	@GetMapping("/id")
	public ResponseEntity<ImovelDTO>  getImovelById(@RequestHeader("user-id") Long userId) throws ImobiliariaNotFoundException, JsonProcessingException {
		return imovelService.findById(userId);

	}
	
	
}
