package br.com.imobApp.imobAppWeb.dtos;

public class ImobiliariaDTO {
	private String nome;
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
	
	@Override
	public String toString() {
		return "ImobiliariaDTO [nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
}
