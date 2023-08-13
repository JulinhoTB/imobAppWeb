package br.com.imobApp.imobAppWeb.comum.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import br.com.imobApp.imobAppWeb.exceptions.ImovelNotFoundException;

@ControllerAdvice
public class DefaultExceptionHandler {
	
	@ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> handleImovelNotFoundException(ImovelNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                             .body("Imóvel não foi encontrado na base");
    }

}
