package com.laymancraft.nonFactory.pulpExtractor.impl;

import com.laymancraft.nonFactory.pulpExtractor.PulpExtractor;

public class MangoPulpExtractor implements PulpExtractor {

	@Override
	public void peel() {
		System.out.println("peel mango");
	}
	
	@Override
	public void removeSeed() {
		System.out.println("remove mango seed");
	}

	@Override
	public void separatePulp() {
		System.out.println("separate mango pulp");
	}

}
