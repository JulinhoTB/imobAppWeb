package br.com.imobApp.imobAppWeb.exceptions;

public class ImovelNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ImovelNotFoundException() {
        super();
    }
	
	public ImovelNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ImovelNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
	
}
