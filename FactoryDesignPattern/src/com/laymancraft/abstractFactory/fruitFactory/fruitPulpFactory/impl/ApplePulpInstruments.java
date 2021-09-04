package com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.impl;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.PulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.apple.ApplePeeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.apple.ApplePulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.apple.AppleSeedRemover;

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
