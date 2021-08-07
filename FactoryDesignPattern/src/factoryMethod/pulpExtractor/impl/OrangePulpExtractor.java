package factoryMethod.pulpExtractor.impl;

import factoryMethod.pulpExtractor.PulpExtractor;

public class OrangePulpExtractor implements PulpExtractor {

	@Override
	public void wash() {
		System.out.println("wash orange");
	}

	@Override
	public void peel() {
		System.out.println("peel orange");

	}

	@Override
	public void extract() {
		System.out.println("extract orange");

	}

}
