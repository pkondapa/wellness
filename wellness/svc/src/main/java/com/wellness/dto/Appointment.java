package com.wellness.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class Appointment implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int appointmentId;
	private int userId;
	private int addressId;
	private int proceduresId;
	private Timestamp dateOfAppointment;
	private String reason;

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

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getProceduresId() {
		return proceduresId;
	}

	public void setProceduresId(int proceduresId) {
		this.proceduresId = proceduresId;
	}

	public Timestamp getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Timestamp dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
}
