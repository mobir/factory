package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.orange;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;

public class OrangePulpSeparator implements PulpSeparator {
	// Concrete Product of Orange Family
	
	@Override
	public void separatePulp() {
		System.out.println("separate orange pulp");
	}

}
