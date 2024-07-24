package com.app;

public class Address {
	private String houseNo;
	private String area;
	private String city;
	private String state;
	private String country;
	private String zipCode;
	
	public Address() {
		super();
	}

	public Address(String houseNo, String area, String city, String state, String country, String zipCode) {
		super();
		this.houseNo = houseNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zipCode = zipCode;
	}
	
	public String getHouseNo() {
		return houseNo;
	}

	public String getArea() {
		return area;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getCountry() {
		return country;
	}

	public String getZipCode() {
		return zipCode;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", area=" + area + ", city=" + city + ", state=" + state + ", country="
				+ country + ", zipCode=" + zipCode + "]";
	}
	
}
