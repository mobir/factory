package simpleFactory.pulpExtractor.impl;

import simpleFactory.pulpExtractor.PulpExtractor;

public class OrangePulpExtractor implements PulpExtractor {

	@Override
	public void peel() {
		System.out.println("peel orange");
	}
	
	@Override
	public void removeSeed() {
		System.out.println("remove orange seed");
	}

	@Override
	public void separatePulp() {
		System.out.println("separate orange pulp");
	}

}
