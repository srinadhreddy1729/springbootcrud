//package com.example.profiles.ExceptionLayer;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//
//@ControllerAdvice
//public class ExceptionClassLayer {
//	@ExceptionHandler(MethodArgumentNotValidException.class)
//	public ResponseEntity<Map<String,String>> ExceptionClass(MethodArgumentNotValidException error)
//	{
//		Map<String,String> exception=new LinkedHashMap<String, String>();
//		
//		BindingResult jps=error.getBindingResult();
//		
//		  jps.getFieldErrors().forEach((errors)->{
//			  String s=errors.getField();
//			  String s1=errors.getDefaultMessage();
//			  exception.put(s, s1);
//		  }
//		  );
//		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception);
//		
//	}
//
//}
