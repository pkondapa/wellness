package com.wellness.dto;

import java.io.Serializable;

public class Prescription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int prescriptionId;
	private int userId;
	private int doctorId;
	private String dosage;
	
	public int getPrescriptionId() {
		return prescriptionId;
	}
	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}
	public String getDosage() {
		return dosage;
	}
	public void setDosage(String dosage) {
		this.dosage = dosage;
	}
}
