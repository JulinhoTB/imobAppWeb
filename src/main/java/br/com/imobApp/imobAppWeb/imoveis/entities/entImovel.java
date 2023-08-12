package br.com.imobApp.imobAppWeb.imoveis.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_imovel")
public class entImovel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CP_ID")
	private Long id;
	@Column(name="CP_NOME", nullable = false, length = 50)
	private String nome;
	@Column(name="CP_VALOR")
	private BigDecimal valor;
	@Column(name="CP_AREA")
	private double area;
	@Column(name="CP_DT_INCLUSAO", nullable = false)
	private LocalDateTime dt_inclusao;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
	public LocalDateTime getDt_inclusao() {
		return dt_inclusao;
	}
	public void setDt_inclusao(LocalDateTime dt_inclusao) {
		this.dt_inclusao = dt_inclusao;
	}
}
