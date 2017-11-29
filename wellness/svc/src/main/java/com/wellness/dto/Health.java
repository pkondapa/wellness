package com.wellness.dto;

import java.io.Serializable;

public class Health implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int healthId;
	private int userId;
	private int heightInches;
	private int weightInPounds;
	private int bodyMassIndex;

	public int getHealthId() {
		return healthId;
	}

	public void setHealthId(int healthId) {
		this.healthId = healthId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getHeightInches() {
		return heightInches;
	}

	public void setHeightInches(int heightInches) {
		this.heightInches = heightInches;
	}

	public int getWeightInPounds() {
		return weightInPounds;
	}

	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}

	public int getBodyMassIndex() {
		return bodyMassIndex;
	}

	public void setBodyMassIndex(int bodyMassIndex) {
		this.bodyMassIndex = bodyMassIndex;
	}
}
