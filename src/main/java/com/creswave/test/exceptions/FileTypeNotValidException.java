package com.creswave.test.exceptions;

public class FileTypeNotValidException  extends Exception{private static final long serialVersionUID = 1L;

	String fieldName;
	String fileType;
    public FileTypeNotValidException(String fieldName, String fileType) {
		super(String.format("%s Type is Invalid : %s", fieldName, fileType));
		this.fieldName = fieldName;
		this.fileType = fileType;
	}


}
