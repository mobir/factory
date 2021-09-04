package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.orange;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;

public class OrangeSeedRemover implements SeedRemover {
	// Concrete Product of Orange Family
	
	@Override
	public void removeSeed() {
		System.out.println("remove orange seeds");
	}


}
