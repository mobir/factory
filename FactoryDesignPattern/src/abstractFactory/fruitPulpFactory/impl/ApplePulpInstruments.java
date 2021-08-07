package abstractFactory.fruitPulpFactory.impl;

import abstractFactory.fruitPulpFactory.PulpInstruments;
import abstractFactory.fruitPulpProducts.Peeler;
import abstractFactory.fruitPulpProducts.PulpSeparator;
import abstractFactory.fruitPulpProducts.SeedRemover;
import abstractFactory.fruitPulpProducts.apple.ApplePeeler;
import abstractFactory.fruitPulpProducts.apple.ApplePulpSeparator;
import abstractFactory.fruitPulpProducts.apple.AppleSeedRemover;

public class ApplePulpInstruments implements PulpInstruments {
	// Concrete Factory of Product Family
	
	@Override
	public Peeler getPeeler() {
		return new ApplePeeler();
	}

	@Override
	public SeedRemover getSeedRemover() {
		return new AppleSeedRemover();
	}

	@Override
	public PulpSeparator getPulpSeparator() {
		return new ApplePulpSeparator();
	}

}
