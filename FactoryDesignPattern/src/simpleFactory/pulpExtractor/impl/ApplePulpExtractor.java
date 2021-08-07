package simpleFactory.pulpExtractor.impl;

import simpleFactory.pulpExtractor.PulpExtractor;

public class ApplePulpExtractor implements PulpExtractor {

	@Override
	public void wash() {
		System.out.println("wash apple");
	}

	@Override
	public void peel() {
		System.out.println("peel apple");

	}

	@Override
	public void extract() {
		System.out.println("extract apple");

	}

}