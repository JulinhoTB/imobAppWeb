package br.com.imobApp.imobAppWeb.comum.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.imobApp.imobAppWeb.dtos.CadastrarImobiliariaRequestDTO;
import br.com.imobApp.imobAppWeb.dtos.ResponseImobiliariaDTO;
import br.com.imobApp.imobAppWeb.models.EntImobiliaria;

@Mapper(componentModel = "spring")
public interface ImobiliariaMapper {
	
	ImobiliariaMapper INSTANCE = Mappers.getMapper(ImobiliariaMapper.class);
    ResponseImobiliariaDTO entToDTO(EntImobiliaria entImobiliaria);
    EntImobiliaria dtoToEnt(CadastrarImobiliariaRequestDTO imobiliariaDTO);
    
}
