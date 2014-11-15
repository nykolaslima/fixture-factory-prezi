package com.vivareal.fixtureFactoryPrezi.domain.model.listing.address;

public class Address {

	private State state;
	private String city;
	private String street;
	private String zipCode;
	
	public Address(State state, String city, String street, String zipCode) {
		this.state = state;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}

	public State getState() {
		return state;
	}
	public String getCity() {
		return city;
	}
	public String getStreet() {
		return street;
	}
	public String getZipCode() {
		return zipCode;
	}
	
}
