package com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.impl;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.PulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.orange.OrangePeeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.orange.OrangePulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.orange.OrangeSeedRemover;

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
