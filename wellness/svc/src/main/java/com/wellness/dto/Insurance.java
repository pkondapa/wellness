package com.wellness.dto;

import java.io.Serializable;
import java.sql.Date;

public class Insurance implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int insuranceId;
	private String brand;
	private String plan;
	private Date expirationDate;
	
	public int getInsuranceId() {
		return insuranceId;
	}
	public void setInsuranceId(int insuranceId) {
		this.insuranceId = insuranceId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
}
