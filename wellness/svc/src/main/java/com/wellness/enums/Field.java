package com.wellness.enums;

public enum Field {

	GENERAL("General"),
	SURGERY("Surgery");
	
	private String field;
	
	Field(String field)  {
		this.field = field;
	}
	
	public String getField()  {
		return this.field;
	}
}
