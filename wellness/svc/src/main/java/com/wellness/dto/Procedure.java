package com.wellness.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Procedure implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int proceduresId;
	private int appointmentId;
	private int medicalReportId;
	private String proceduresType;
	private String proceduresDesc;
	private BigDecimal cost;

	public int getProceduresId() {
		return proceduresId;
	}

	public void setProceduresId(int proceduresId) {
		this.proceduresId = proceduresId;
	}

	public int getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
	}

	public int getMedicalReportId() {
		return medicalReportId;
	}

	public void setMedicalReportId(int medicalReportId) {
		this.medicalReportId = medicalReportId;
	}

	public String getProceduresType() {
		return proceduresType;
	}

	public void setProceduresType(String proceduresType) {
		this.proceduresType = proceduresType;
	}

	public String getProceduresDesc() {
		return proceduresDesc;
	}

	public void setProceduresDesc(String proceduresDesc) {
		this.proceduresDesc = proceduresDesc;
	}

	public BigDecimal getCost() {
		return cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
}
