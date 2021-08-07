package abstractFactory.fruitPulpFactory.impl;

import abstractFactory.fruitPulpFactory.PulpInstruments;
import abstractFactory.fruitPulpProducts.Peeler;
import abstractFactory.fruitPulpProducts.PulpSeparator;
import abstractFactory.fruitPulpProducts.SeedRemover;
import abstractFactory.fruitPulpProducts.mango.MangoPeeler;
import abstractFactory.fruitPulpProducts.mango.MangoPulpSeparator;
import abstractFactory.fruitPulpProducts.mango.MangoSeedRemover;

public class MangoPulpInstruments implements PulpInstruments {
	// Concrete Factory of Product Family
	
	@Override
	public Peeler getPeeler() {
		return new MangoPeeler();
	}

	@Override
	public SeedRemover getSeedRemover() {
		return new MangoSeedRemover();
	}

	@Override
	public PulpSeparator getPulpSeparator() {
		return new MangoPulpSeparator();
	}

}
