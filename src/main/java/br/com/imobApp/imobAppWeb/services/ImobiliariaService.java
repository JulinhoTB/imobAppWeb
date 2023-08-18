package br.com.imobApp.imobAppWeb.services;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.imobApp.imobAppWeb.comum.mappers.ImobiliariaMapper;
import br.com.imobApp.imobAppWeb.dtos.CadastrarImobiliariaRequestDTO;
import br.com.imobApp.imobAppWeb.dtos.ImobiliariaDTO;
import br.com.imobApp.imobAppWeb.models.EntImobiliaria;
import br.com.imobApp.imobAppWeb.repositories.ImobiliariaRepository;

@Service
public class ImobiliariaService {
		private static final Logger LOG = LoggerFactory.getLogger(ImovelService.class);
		
		@Autowired
		ImobiliariaRepository imobiliariaRepository;
		
		ObjectMapper objectMapper = new ObjectMapper();	

		public ImobiliariaDTO cadastrarImobiliaria(CadastrarImobiliariaRequestDTO request) {
			
			ImobiliariaDTO response = new ImobiliariaDTO();
			try {
				EntImobiliaria imob = new EntImobiliaria();
				imob.setCnpj(request.getCnpj());
				imob.setNome(request.getNome());
				imob.setDt_inclusao(LocalDateTime.now());
				
				imob = imobiliariaRepository.save(imob);
				LOG.info("Imobiliária Criada: "+ imob.getNome()+imob.getCnpj());
				
				response = ImobiliariaMapper.INSTANCE.entToDTO(imob);
			} catch (Exception e) {
				e.printStackTrace();
			}
			return response;
		}


}
	

