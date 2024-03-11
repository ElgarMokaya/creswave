package com.creswave.test.exceptions;

public class EmailNotFoundException extends Exception{

    private static final long serialVersionUID = 1L;

	String resourceName;
	String fieldName;
	String fieldValue;

    public EmailNotFoundException(String resourceName, String fieldName, String userId) {
		super(String.format("%s Not Found With This %s : %s", resourceName, fieldName, userId));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = userId;
	}

}
