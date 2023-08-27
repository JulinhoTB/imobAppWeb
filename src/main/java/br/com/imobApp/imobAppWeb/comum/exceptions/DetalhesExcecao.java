package br.com.imobApp.imobAppWeb.comum.exceptions;

import java.time.LocalDateTime;

public class DetalhesExcecao {
	private LocalDateTime timestamp;
    private String mensagem;
    private int codigoErro;
    private String path;
    private Object stackTrace;
    
    public DetalhesExcecao(String mensagem,int codigoErro, String path, Object object) {
    	this.timestamp = LocalDateTime.now();
    	this.codigoErro = codigoErro;
    	this.mensagem = mensagem;
    	this.path = path;
      	this.stackTrace=object;
    }

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getCodigoErro() {
		return codigoErro;
	}

	public void setCodigoErro(int codigoErro) {
		this.codigoErro = codigoErro;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Object getStackTrace() {
		return stackTrace;
	}

	public void setStackTrace(Object stackTrace) {
		this.stackTrace = stackTrace;
	}
	
    
}
