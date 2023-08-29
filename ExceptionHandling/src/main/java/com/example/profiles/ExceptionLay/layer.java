package com.example.profiles.ExceptionLay;

import org.antlr.v4.runtime.atn.ErrorInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@ControllerAdvice
@ResponseBody
public class layer {
	@ExceptionHandler(IAM_NOT_HUMAN_EXCEPTION.class)
	public ResponseEntity<String> body(Exception message)
	{
		Message jj=null;
		if(!(message instanceof IAM_NOT_HUMAN_EXCEPTION))
		{
		 jj=new Message(HttpStatus.NOT_FOUND,message.getMessage(),"srinadh");
		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("null");

	}
			

}
