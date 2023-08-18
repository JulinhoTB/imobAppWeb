package br.com.imobApp.imobAppWeb.models;

import java.time.LocalDateTime;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_imobiliaria")
public class EntImobiliaria {
	@Id
	@Column(name="CP_CNPJ", nullable = false, length = 14, unique = true )
	private String cnpj;
	@Column(name="CP_NOME", nullable = false, length = 50)
	private String nome;
	@Column(name="CP_DT_INCLUSAO", nullable = false)
	private LocalDateTime dt_inclusao;
	
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
