package com.vivareal.fixtureFactoryPrezi.domain.model.listing.validation;

import java.util.ArrayList;
import java.util.List;

import com.vivareal.fixtureFactoryPrezi.domain.model.listing.Listing;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.State;

public class NewListingValidator {

	private List<String> errors = new ArrayList<String>();
	
	public boolean hasErrors() {
		return errors != null && errors.size() > 0;
	}

	public void validate(Listing listing) {
		if(listing.getAddress().getState() == State.MG) {
			addError("Não são permitidos imóveis de Minas Gerais");
		}
	}
	
	private void addError(String message) {
		if(errors == null) {
			errors = new ArrayList<String>();
		}
		
		errors.add(message);
	}
	
}
