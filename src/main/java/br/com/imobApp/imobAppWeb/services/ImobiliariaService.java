package br.com.imobApp.imobAppWeb.services;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

import javax.swing.Spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.imobApp.imobAppWeb.comum.exceptions.ImobiliariaExistenteException;
import br.com.imobApp.imobAppWeb.comum.exceptions.ImobiliariaNotFoundException;
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
		
		
		
		
		public List<ResponseImobiliariaDTO> listarImobiliarias() {
			var imobiliarias = imobiliariaRepository.findAll();
			List<ResponseImobiliariaDTO> imobs = new LinkedList<>();
			
			if(imobiliarias.isEmpty()) {
				return null;
			}
			
			
			imobiliarias.forEach(imob ->imobs.add(ImobiliariaMapper.INSTANCE.entToDTO(imob)));

			
			return imobs;
		}
		
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
		
		public ResponseImobiliariaDTO removerImobiliaria(String cnpj) {
			if(cnpj!=null && cnpj!="") {
				EntImobiliaria entImob = imobiliariaRepository.findByCnpj(cnpj);
				if(entImob!=null) {
					ResponseImobiliariaDTO responseImob = new ResponseImobiliariaDTO();
					responseImob = ImobiliariaMapper.INSTANCE.entToDTO(entImob);
					imobiliariaRepository.delete(entImob);
					LOG.warn("Imobiliária removida: "+ entImob.getNome()+entImob.getCnpj());
					
					return responseImob;
				}
				throw new ImobiliariaNotFoundException("A imobiliária com cnpj nº {"+cnpj+"} não foi encontrada no sistema");
			}
			
			return null;			
		}
		
		public ResponseImobiliariaDTO alterarImobiliaria(String cnpj) {
			
			return null;
		}


}
	

