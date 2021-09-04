package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.apple;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;

public class AppleSeedRemover implements SeedRemover {
	// Concrete Product of Apple Family
	
	@Override
	public void removeSeed() {
		System.out.println("remove apple seeds");
	}


}
