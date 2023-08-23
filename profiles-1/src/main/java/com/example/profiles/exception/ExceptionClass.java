package com.example.profiles.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseStatus
public class ExceptionClass {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String,String>> EntityClass(MethodArgumentNotValidException error)
	{
		Map<String,String> jj=new LinkedHashMap<String,String>();
		BindingResult pp=error.getBindingResult();
		pp.getFieldErrors().forEach((errors)->
		{
			String fieldname=errors.getField();
			String errormessage=errors.getDefaultMessage();
			jj.put(fieldname,errormessage);
		}
		);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(jj);
		
		
	}

}
