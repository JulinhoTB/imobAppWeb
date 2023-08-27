package br.com.imobApp.imobAppWeb.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CadastrarImobiliariaRequestDTO {
	
	@NotNull(message="O campo nome é de preenchimento obrigatório!")
	@NotBlank(message="O campo nome é de preenchimento obrigatório!")
	private String nome;
	
	@Size(message ="O campo CNPJ deve conter 14 digitos!")
	private String cnpj;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
