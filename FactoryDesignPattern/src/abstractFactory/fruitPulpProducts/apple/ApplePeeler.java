package abstractFactory.fruitPulpProducts.apple;

import abstractFactory.fruitPulpProducts.Peeler;

public class ApplePeeler implements Peeler {
	// Concrete Product of Apple Family
	
	@Override
	public void peelFruit() {
		System.out.println("peel apple");
	}

}
