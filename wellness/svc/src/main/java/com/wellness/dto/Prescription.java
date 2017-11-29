package com.wellness.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Prescription implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int prescriptionId;
	private int proceduresId;
	private String nameOfPrescription;
	private String dosage;
	private String directions;
	private BigDecimal cost;

	public int getPrescriptionId() {
		return prescriptionId;
	}

	public void setPrescriptionId(int prescriptionId) {
		this.prescriptionId = prescriptionId;
	}

	public int getProceduresId() {
		return proceduresId;
	}

	public void setProceduresId(int proceduresId) {
		this.proceduresId = proceduresId;
	}

	public String getNameOfPrescription() {
		return nameOfPrescription;
	}

	public void setNameOfPrescription(String nameOfPrescription) {
		this.nameOfPrescription = nameOfPrescription;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public String getDirections() {
		return directions;
	}

	public void setDirections(String directions) {
		this.directions = directions;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
}
