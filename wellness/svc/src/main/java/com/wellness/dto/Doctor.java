package com.wellness.dto;

import java.io.Serializable;

import com.wellness.enums.Field;

public class Doctor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int doctorId;
	private String firstName;
	private String lastName;
	private Field field;
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Field getField() {
		return field;
	}
	public void setField(Field field) {
		this.field = field;
	}
}
