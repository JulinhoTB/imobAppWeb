package br.com.imobApp.imobAppWeb.services;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.imobApp.imobAppWeb.comum.exceptions.ImobiliariaExistenteException;
import br.com.imobApp.imobAppWeb.comum.mappers.ImobiliariaMapper;
import br.com.imobApp.imobAppWeb.dtos.CadastrarImobiliariaRequestDTO;
import br.com.imobApp.imobAppWeb.dtos.ResponseImobiliariaDTO;
import br.com.imobApp.imobAppWeb.models.EntImobiliaria;
import br.com.imobApp.imobAppWeb.repositories.ImobiliariaRepository;

@Service
public class ImobiliariaService {
		private static final Logger LOG = LoggerFactory.getLogger(ImovelService.class);
		
		@Autowired
		ImobiliariaRepository imobiliariaRepository;
		
		ObjectMapper objectMapper = new ObjectMapper();	

		public ResponseImobiliariaDTO cadastrarImobiliaria(CadastrarImobiliariaRequestDTO request) {
			
			ResponseImobiliariaDTO responseImob = new ResponseImobiliariaDTO();
			EntImobiliaria entImob = imobiliariaRepository.findByCnpj(request.getCnpj());
			if(entImob!=null) {
				throw new ImobiliariaExistenteException("Já existe cadastro para a imobiliária de CNPJ: "+request.getCnpj());
			}
			
			entImob = ImobiliariaMapper.INSTANCE.dtoToEnt(request);
			entImob.setDt_inclusao(LocalDateTime.now());
			
			entImob = imobiliariaRepository.save(entImob);
			LOG.info("Imobiliária Criada: "+ entImob.getNome()+entImob.getCnpj());
			
			responseImob = ImobiliariaMapper.INSTANCE.entToDTO(entImob);
			return responseImob;
		}


}
	

