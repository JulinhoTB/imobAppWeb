package br.com.imobApp.imobAppWeb.comum.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.imobApp.imobAppWeb.dtos.ImobiliariaDTO;
import br.com.imobApp.imobAppWeb.models.EntImobiliaria;

@Mapper(componentModel = "spring")
public interface ImobiliariaMapper {
	
	ImobiliariaMapper INSTANCE = Mappers.getMapper(ImobiliariaMapper.class);
    ImobiliariaDTO entToDTO(EntImobiliaria entImobiliaria);
    EntImobiliaria dtoToEnt(ImobiliariaDTO imobiliariaDTO);
    
}
