package simpleFactory.pulpExtractor.impl;

import simpleFactory.pulpExtractor.PulpExtractor;

public class MangoPulpExtractor implements PulpExtractor {

	@Override
	public void wash() {
		System.out.println("wash mango");
	}

	@Override
	public void peel() {
		System.out.println("peel mango");

	}

	@Override
	public void extract() {
		System.out.println("extract mango");

	}

}
