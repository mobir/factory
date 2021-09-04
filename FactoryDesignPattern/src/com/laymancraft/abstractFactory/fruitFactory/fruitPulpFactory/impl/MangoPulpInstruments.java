package com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.impl;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.PulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.mango.MangoPeeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.mango.MangoPulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.mango.MangoSeedRemover;

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
