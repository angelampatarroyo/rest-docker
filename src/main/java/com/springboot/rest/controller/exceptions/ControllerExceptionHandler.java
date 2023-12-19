package com.springboot.rest.controller.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

/**The @RestControllerAdvice annotation is specialization of @Component annotation so that it is auto-detected via classpath scanning.
 *  It is a kind of interceptor that surrounds the logic in our Controllers and allows us to apply some common logic to them.**/
@RestControllerAdvice
public class ControllerExceptionHandler {
	
	/**
	 * Rest Controller Advice’s methods (annotated with @ExceptionHandler) are shared globally across multiple 
	 * @Controller components to capture exceptions and translate them to HTTP responses. 
	 * The @ExceptionHandler annotation indicates which type of Exception we want to handle. 
	 * The exception instance and the request will be injected via method arguments.
	 * **/
	 @ExceptionHandler(value = Exception.class)
	  @ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
	public Map<String,String> jdbcException(Exception ex, WebRequest request){
		Map<String,String> exceptionMap = new HashMap<>();
		exceptionMap.put("message","Error en Base de datos");
		exceptionMap.put("descripcion", ex.getMessage());
		return exceptionMap;
	}

}
