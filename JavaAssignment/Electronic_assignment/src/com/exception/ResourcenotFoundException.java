package com.exception;

public class ResourcenotFoundException {
	
private String message; 
	
	public ResourcenotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	private static final long serialVersionUID = 2976458660109929224L;

}
