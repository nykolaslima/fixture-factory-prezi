package com.vivareal.fixtureFactoryPrezi.infrastructure.fixture.listing.address;

import static com.vivareal.fixtureFactoryPrezi.infrastructure.fixture.function.ZipCodeFunction.zipCode;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.Address;
import com.vivareal.fixtureFactoryPrezi.domain.model.listing.address.State;

public class AddressTemplateLoader implements TemplateLoader {

	@Override
	public void load() {
		Fixture.of(Address.class).addTemplate("valid", new Rule() {{
			add("state", random(State.class));
			add("city", random("São Paulo", "Osasco", "Guarulhos", "Minas Gerais", "Bahia", "Santa Maria"));
			add("street", regex("\\w{10} \\d{3}"));
			//this is a custom function, you can create yours!
			add("zipCode", zipCode());
		}})
		.addTemplate("fromMinasGerais").inherits("valid", new Rule() {{
			add("state", State.MG);
		}});
	}

}
