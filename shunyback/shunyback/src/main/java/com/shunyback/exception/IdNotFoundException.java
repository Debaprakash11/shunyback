package com.shunyback.exception;

public class IdNotFoundException extends RuntimeException {
	@Override
	public String getMessage() {
		return "Record Not Found or Invalid...";
	}
	

}
