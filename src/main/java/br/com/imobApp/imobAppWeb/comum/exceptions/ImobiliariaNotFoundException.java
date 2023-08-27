package br.com.imobApp.imobAppWeb.comum.exceptions;

public class ImobiliariaNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ImobiliariaNotFoundException(String mensagem) {
        super(mensagem);
    }


}
