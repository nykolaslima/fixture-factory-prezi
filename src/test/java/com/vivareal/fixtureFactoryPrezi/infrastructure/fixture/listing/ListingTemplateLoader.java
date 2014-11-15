package com.vivareal.fixtureFactoryPrezi.infrastructure.fixture.listing;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

import com.vivareal.fixtureFactoryPrezi.domain.model.listing.Listing;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.Address;
import com.vivareal.fixtureFactoryPrezi.domain.model.publisher.Publisher;

public class ListingTemplateLoader implements TemplateLoader {

	@Override
	public void load() {
		Fixture.of(Listing.class).addTemplate("valid", new Rule() {{
			add("id", sequence(Long.class));
			add("title", random("Imóvel legal",  "Imóvel ótimo estado", "Casa muito boa", "Oportunidade imperdivel"));
			add("publisher", one(Publisher.class, "valid"));
			add("address", one(Address.class, "valid"));
			add("creationDate", instant("one month ago"));
		}})
		.addTemplate("fromMinasGerais").inherits("valid", new Rule() {{
			add("address", one(Address.class, "fromMinasGerais"));
		}});
	}

}
