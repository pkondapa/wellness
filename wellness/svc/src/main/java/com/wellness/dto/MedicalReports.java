package com.wellness.dto;

import java.io.Serializable;
import java.sql.Date;

public class MedicalReports implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int procedureId;
	private Date dateOfReport;
	private String report;

	public int getProcedureId() {
		return procedureId;
	}

	public void setProcedureId(int procedureId) {
		this.procedureId = procedureId;
	}

	public Date getDateOfReport() {
		return dateOfReport;
	}

	public void setDateOfReport(Date dateOfReport) {
		this.dateOfReport = dateOfReport;
	}

	public String getReport() {
		return report;
	}

	public void setReport(String report) {
		this.report = report;
	}
}
