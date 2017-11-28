package com.wellness.enums;

public enum Gender {

	MALE("M"),
	FEMALE("F"),
	PREFER_NOT_TO_ANSWER("N/A");
	
	private String gender;
	
	Gender(String gender)  {
		this.gender = gender;
	}
	
	public String getGender()  {
		return this.gender;
	}
}
