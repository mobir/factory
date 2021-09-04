package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.orange;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;

public class OrangePeeler implements Peeler {
	// Concrete Product of Orange Family
	
	@Override
	public void peelFruit() {
		System.out.println("peel orange");
	}

}
