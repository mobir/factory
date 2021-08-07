package factoryMethod.pulpExtractor.impl;

import factoryMethod.pulpExtractor.PulpExtractor;

public class OrangePulpExtractor implements PulpExtractor {

	@Override
	public void peel() {
		System.out.println("peel orange");
	}
	
	@Override
	public void removeSeeds() {
		System.out.println("remove orange seeds");
	}

	@Override
	public void separatePulp() {
		System.out.println("separate orange pulp");
	}

}
