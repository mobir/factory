package com.laymancraft.nonFactory.pulpExtractor.impl;

import com.laymancraft.nonFactory.pulpExtractor.PulpExtractor;

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
