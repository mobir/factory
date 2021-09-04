package com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;

public interface PulpInstruments {
	// Factory of Product Family
	
	Peeler getPeeler();
	
	SeedRemover getSeedRemover();
	
	PulpSeparator getPulpSeparator();

}
