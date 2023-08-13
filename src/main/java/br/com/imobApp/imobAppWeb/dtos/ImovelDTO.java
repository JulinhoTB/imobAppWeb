package br.com.imobApp.imobAppWeb.dtos;

import java.math.BigDecimal;

public class ImovelDTO {
	private String nome;
	private BigDecimal valor;
	private double area;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "ImovelDTO [nome=" + nome + ", valor=" + valor + ", area=" + area + "]";
	}

}
