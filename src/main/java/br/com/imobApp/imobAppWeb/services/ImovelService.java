package br.com.imobApp.imobAppWeb.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.imobApp.imobAppWeb.comum.mappers.ImovelMapper;
import br.com.imobApp.imobAppWeb.dtos.ImovelDTO;
import br.com.imobApp.imobAppWeb.exceptions.ImovelNotFoundException;
import br.com.imobApp.imobAppWeb.models.EntImovel;
import br.com.imobApp.imobAppWeb.repositories.ImovelRepository;

@Service
public class ImovelService {
	private static final Logger LOG = LoggerFactory.getLogger(ImovelService.class);
	
	@Autowired
	ImovelRepository imovelRepository;
	ObjectMapper objectMapper = new ObjectMapper();	

	public ResponseEntity<ImovelDTO> findById(Long id) throws ImovelNotFoundException, JsonProcessingException{
		
		ImovelDTO imv=new ImovelDTO();
		try {
			EntImovel imovelEnt = imovelRepository.findById(id).orElseThrow(() -> new ImovelNotFoundException("Imóvel de ID "+id+" não foi encontrado na base, retornou como resultado"));
			imv =ImovelMapper.INSTANCE.entToDTO(imovelEnt);
		}catch(ImovelNotFoundException e) {
			String json = objectMapper.writeValueAsString(imv);
			LOG.error("ImovelNotFoundException: ["+e.getMessage()+"]["+json+"]");
		}
		ResponseEntity<ImovelDTO> imovel = new ResponseEntity<ImovelDTO>(imv, HttpStatus.OK);
		return imovel;
	}

	
}
