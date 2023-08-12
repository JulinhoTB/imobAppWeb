package br.com.imobApp.imobAppWeb.imobiliarias.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_imobiliaria")
public class entImobiliaria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="CP_ID")
	private Long id;
	@Column(name="CP_NOME", nullable = false, length = 50)
	private String nome;
	@Column(name="CP_CNPJ", nullable = false)
	private String cnpj;
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
	public LocalDateTime getDt_inclusao() {
		return dt_inclusao;
	}
	public void setDt_inclusao(LocalDateTime dt_inclusao) {
		this.dt_inclusao = dt_inclusao;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
