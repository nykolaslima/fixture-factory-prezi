package com.vivareal.fixtureFactoryPrezi.domain.model.publisher;

import java.util.Date;

public class Publisher {

	private Long id;
	private String name;
	private Date creationDate;
	
	public Publisher(Long id, String name, Date creationDate) {
		this.id = id;
		this.name = name;
		this.creationDate = creationDate;
	}

	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	
}
