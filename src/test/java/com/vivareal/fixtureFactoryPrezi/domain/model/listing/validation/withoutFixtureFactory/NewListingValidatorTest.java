package com.vivareal.fixtureFactoryPrezi.domain.model.listing.validation.withoutFixtureFactory;

import static junit.framework.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;

import com.vivareal.fixtureFactoryPrezi.domain.model.listing.Listing;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.Address;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.State;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.validation.NewListingValidator;
import com.vivareal.fixtureFactoryPrezi.domain.model.publisher.Publisher;

public class NewListingValidatorTest {

	private NewListingValidator newListingValidator;
	
	@Test
	public void listingsFromMinasGeraisShouldNotBeAllowed() {
		Publisher publisher = new Publisher(1l, "Imobiliária do Nykolas", new Date());
		Address address = new Address(State.MG, "Minas Gerais", "Rua Xpto", "99999-999");
		Listing listing = new Listing(1l, "Imóvel de Minas gerais", publisher, address, new Date());
		
		newListingValidator.validate(listing);
		
		assertTrue(newListingValidator.hasErrors());
	}
	
}
