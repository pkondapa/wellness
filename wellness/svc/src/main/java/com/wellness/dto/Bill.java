package com.wellness.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Bill implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int billId;
	private int prescriptionId;
	private int appointmentId;
	private BigDecimal balance;
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public int getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
}
