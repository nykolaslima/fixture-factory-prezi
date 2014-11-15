package com.vivareal.fixtureFactoryPrezi.domain.model.listing;

import java.util.Date;

import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.Address;
import com.vivareal.fixtureFactoryPrezi.domain.model.publisher.Publisher;

public class Listing {

	private Long id;
	private String title;
	private Publisher publisher;
	private Address address;
	private Date creationDate;
	
	public Listing(Long id, String title, Publisher publisher, Address address, Date creationDate) {
		this.id = id;
		this.title = title;
		this.publisher = publisher;
		this.address = address;
		this.creationDate = creationDate;
	}

	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public Address getAddress() {
		return address;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	
}
