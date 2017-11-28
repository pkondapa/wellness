package com.wellness.dto;

import java.io.Serializable;

import com.wellness.enums.Field;

public class MedicalReports implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private int doctorId;
	private String description;
	private Field field;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field field) {
		this.field = field;
	}

}
