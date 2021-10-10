package com.Bar.covid.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="userSymptomatic")
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	@Column(name="name")
	private String name;
	
	@Column(name="mobileNumber")
	private String mobileNumber;
	
	@Column(name="pincode")
	private String pincode;
	
	private String symptoms;
	
	private Boolean travelHistory;
	
	private Boolean contactWithCovidPatient;

	public String getSymptoms() {
		return symptoms;
	}

	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}

	public Boolean getTravelHistory() {
		return travelHistory;
	}

	public void setTravelHistory(Boolean travelHistory) {
		this.travelHistory = travelHistory;
	}

	public Boolean getContactWithCovidPatient() {
		return contactWithCovidPatient;
	}

	public void setContactWithCovidPatient(Boolean contactWithCovidPatient) {
		this.contactWithCovidPatient = contactWithCovidPatient;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	
	

}
