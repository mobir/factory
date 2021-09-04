package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.apple;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;

public class ApplePulpSeparator implements PulpSeparator {
	// Concrete Product of Apple Family
	
	@Override
	public void separatePulp() {
		System.out.println("separate apple pulp");
	}

}
