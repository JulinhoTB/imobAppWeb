package br.com.imobApp.imobAppWeb.imoveis.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.imobApp.imobAppWeb.imoveis.entities.entImovel;

public interface imovelRepository extends JpaRepository<entImovel,Long> {

}
