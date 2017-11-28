package com.wellness.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class Appointments implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int appointmentId;
	private int userId;
	private int doctorId;
	private int addressId;
	private Timestamp dateOfAppointment;
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public Timestamp getDateOfAppointment() {
		return dateOfAppointment;
	}
	public void setDateOfAppointment(Timestamp dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}
}
