package com.vivareal.fixtureFactoryPrezi.infrastructure.fixture.publisher;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;

import com.vivareal.fixtureFactoryPrezi.domain.model.publisher.Publisher;

public class PublisherTemplateLoader implements TemplateLoader {

	@Override
	public void load() {
		Fixture.of(Publisher.class).addTemplate("valid", new Rule() {{
			add("id", sequence(Long.class));
			add("name", regex("\\w{15}"));
			add("creationDate", instant("one year ago"));
		}});
	}

}
