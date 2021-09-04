package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.apple;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;

public class ApplePeeler implements Peeler {
	// Concrete Product of Apple Family
	
	@Override
	public void peelFruit() {
		System.out.println("peel apple");
	}

}
