package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.mango;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;

public class MangoPulpSeparator implements PulpSeparator {
	// Concrete Product of Mango Family
	
	@Override
	public void separatePulp() {
		System.out.println("separate mango pulp");
	}

}
