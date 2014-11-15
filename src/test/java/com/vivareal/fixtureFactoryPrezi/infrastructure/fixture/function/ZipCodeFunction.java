package com.vivareal.fixtureFactoryPrezi.infrastructure.fixture.function;

import br.com.six2six.fixturefactory.function.AtomicFunction;

public class ZipCodeFunction implements AtomicFunction {

	@Override
	@SuppressWarnings("unchecked")
	//just an example. You can create your custom functions and use in templates
	public <T> T generateValue() {
		return (T) "05594-130";
	}
	
	public static ZipCodeFunction zipCode() {
		return new ZipCodeFunction();
	}

}
