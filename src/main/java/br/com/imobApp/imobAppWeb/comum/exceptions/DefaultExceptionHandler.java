package br.com.imobApp.imobAppWeb.comum.exceptions;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class DefaultExceptionHandler {
	@Autowired
    private HttpServletRequest request;
	
	@ExceptionHandler(ImobiliariaExistenteException.class)
	public ResponseEntity<DetalhesExcecao> handleImobiliariaExistenteException (ImobiliariaExistenteException e) {
		StackTraceElement[] stackTrace = e.getStackTrace();
		String printStackTrace = "";
		for (StackTraceElement stElmnt : stackTrace) {
			
			printStackTrace +=stElmnt.getClassName()+stElmnt.getMethodName()+";";
			if(stElmnt.getClassName().contains("controllers")) {
				break;
			}
		}
		
		DetalhesExcecao detalhes = new DetalhesExcecao(
				e.getMessage(), 
				HttpStatus.UNPROCESSABLE_ENTITY.value(), 
				request.getRequestURI().toString(), 
				printStackTrace);
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(detalhes);
		
	}


}
