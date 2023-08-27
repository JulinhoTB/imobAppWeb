package br.com.imobApp.imobAppWeb.comum.exceptions;

public class ImobiliariaExistenteException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	
	public ImobiliariaExistenteException(String mensagem) {
		super(mensagem);
		
	}

}
