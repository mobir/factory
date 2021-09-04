package com.laymancraft.factoryMethod.pulpExtractor.impl;

import com.laymancraft.factoryMethod.pulpExtractor.PulpExtractor;

public class ApplePulpExtractor implements PulpExtractor {

	@Override
	public void peel() {
		System.out.println("peel apple");
	}
	
	@Override
	public void removeSeeds() {
		System.out.println("remove apple seeds");
	}

	@Override
	public void separatePulp() {
		System.out.println("separate apple pulp");
	}

}
