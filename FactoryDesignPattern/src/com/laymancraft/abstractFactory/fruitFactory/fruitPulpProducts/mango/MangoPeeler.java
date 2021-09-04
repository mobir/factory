package com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.mango;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;

public class MangoPeeler implements Peeler {
	// Concrete Product of Mango Family
	
	@Override
	public void peelFruit() {
		System.out.println("peel mango");
	}

}
