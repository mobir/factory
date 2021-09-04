package com.laymancraft.factoryMethod.pulpExtractor.impl;

import com.laymancraft.factoryMethod.pulpExtractor.PulpExtractor;

public class MangoPulpExtractor implements PulpExtractor {

	@Override
	public void peel() {
		System.out.println("peel mango");
	}
	
	@Override
	public void removeSeeds() {
		System.out.println("remove mango seed");
	}

	@Override
	public void separatePulp() {
		System.out.println("separate mango pulp");
	}

}
