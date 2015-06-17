package com.chella.automation.webservice;

import java.util.List;

public class AddressResponse {
	private String statusType;
	
	private List<Entities> entity;
	

	static class Entities
	{
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostCode() {
		return postCode;
	}
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	private String number;
	private String street;
	private String city;
	private String postCode;
	private String country;
	}



	public String getStatusType() {
		return statusType;
	}



	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}



	public List<Entities> getEntity() {
		return entity;
	}



	public void setEntity(List<Entities> entity) {
		this.entity = entity;
	}



}
