package com.example.profiles.ExceptionLay;

import org.springframework.http.HttpStatus;

public class Message {
	private HttpStatus status;
	private String message;
	private String handleby;
	public Message(HttpStatus status, String message, String handleby) {
		super();
		this.status = status;
		this.message = message;
		this.handleby = handleby;
	}
	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String gethandleby() {
		return handleby;
	}
	public void sethandleby(String handleby) {
		this.handleby = handleby;
	}

}
