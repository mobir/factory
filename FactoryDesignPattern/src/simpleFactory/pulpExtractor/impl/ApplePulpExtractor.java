package simpleFactory.pulpExtractor.impl;

import simpleFactory.pulpExtractor.PulpExtractor;

public class ApplePulpExtractor implements PulpExtractor {

	@Override
	public void peel() {
		System.out.println("peel apple");
	}
	
	@Override
	public void removeSeed() {
		System.out.println("remove apple seeds");
	}

	@Override
	public void separatePulp() {
		System.out.println("separate apple pulp");

	}

}
