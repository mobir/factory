package abstractFactory.fruitPulpFactory.impl;

import abstractFactory.fruitPulpFactory.PulpInstruments;
import abstractFactory.fruitPulpProducts.Peeler;
import abstractFactory.fruitPulpProducts.PulpSeparator;
import abstractFactory.fruitPulpProducts.SeedRemover;
import abstractFactory.fruitPulpProducts.orange.OrangePeeler;
import abstractFactory.fruitPulpProducts.orange.OrangePulpSeparator;
import abstractFactory.fruitPulpProducts.orange.OrangeSeedRemover;

public class OrangePulpInstruments implements PulpInstruments {
	// Concrete Factory of Product Family
	
	@Override
	public Peeler getPeeler() {
		return new OrangePeeler();
	}

	@Override
	public SeedRemover getSeedRemover() {
		return new OrangeSeedRemover();
	}

	@Override
	public PulpSeparator getPulpSeparator() {
		return new OrangePulpSeparator();
	}

}
