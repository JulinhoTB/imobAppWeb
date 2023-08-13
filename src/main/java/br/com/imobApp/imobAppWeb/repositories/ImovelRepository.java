package br.com.imobApp.imobAppWeb.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobApp.imobAppWeb.models.EntImovel;

public interface ImovelRepository extends JpaRepository<EntImovel,Long> {

	public Optional<EntImovel> findById(Long id);
	
}
