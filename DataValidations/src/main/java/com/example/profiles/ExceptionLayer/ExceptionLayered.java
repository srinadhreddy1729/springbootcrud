package com.example.profiles.ExceptionLayer;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionLayered {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> entityClass(MethodArgumentNotValidException e)
	{
		Map<String,String> errors=new LinkedHashMap<String,String>();
		BindingResult s=e.getBindingResult();
		s.getFieldErrors().forEach(
				(error)->{
					String sn1=error.getField();
					String sn2=error.getDefaultMessage();
					errors.put(sn1, sn2);
				}
				);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errors);
	}

}
