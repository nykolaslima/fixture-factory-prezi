package com.vivareal.fixtureFactoryPrezi.domain.model.listing.validation.withFixtureFactory;

import static junit.framework.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;

import com.vivareal.fixtureFactoryPrezi.domain.model.listing.Listing;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.validation.NewListingValidator;

public class NewListingValidatorTest {

	private NewListingValidator newListingValidator;
	
	@BeforeClass
	public static void setUpClass() {
		FixtureFactoryLoader.loadTemplates("com.vivareal.fixtureFactoryPrezi.infrastructure.fixture");
	}
	
	@Before
	public void setUp() {
		newListingValidator = new NewListingValidator();
	}
	
	@Test
	public void listingsFromMinasGeraisShouldNotBeAllowed() {
		Listing listing = Fixture.from(Listing.class).gimme("fromMinasGerais");
		
		newListingValidator.validate(listing);
		
		assertTrue(newListingValidator.hasErrors());
	}
	
}
