package com.wellness.dto;

import java.io.Serializable;

public class Contact implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int contactId;
	private String phoneNumber;
	private String typeOfContact;

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getTypeOfContact() {
		return typeOfContact;
	}

	public void setTypeOfContact(String typeOfContact) {
		this.typeOfContact = typeOfContact;
	}
}
