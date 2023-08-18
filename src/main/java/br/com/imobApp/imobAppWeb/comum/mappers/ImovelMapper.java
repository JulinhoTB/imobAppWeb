package br.com.imobApp.imobAppWeb.comum.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import br.com.imobApp.imobAppWeb.dtos.ImovelDTO;
import br.com.imobApp.imobAppWeb.models.EntImovel;

@Mapper(componentModel = "spring")
public interface ImovelMapper {
	
	ImovelMapper INSTANCE = Mappers.getMapper(ImovelMapper.class);
	ImovelDTO entToDTO(EntImovel entImovel);
    EntImovel dtoToEnt(ImovelDTO imovelDTO);
    
}
