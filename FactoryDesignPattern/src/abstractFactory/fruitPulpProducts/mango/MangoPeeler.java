package abstractFactory.fruitPulpProducts.mango;

import abstractFactory.fruitPulpProducts.Peeler;

public class MangoPeeler implements Peeler {
	// Concrete Product of Mango Family
	
	@Override
	public void peelFruit() {
		System.out.println("peel mango");
	}

}
