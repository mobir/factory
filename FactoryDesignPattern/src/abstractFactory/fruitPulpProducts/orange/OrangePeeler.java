package abstractFactory.fruitPulpProducts.orange;

import abstractFactory.fruitPulpProducts.Peeler;

public class OrangePeeler implements Peeler {
	// Concrete Product of Orange Family
	
	@Override
	public void peelFruit() {
		System.out.println("peel orange");
	}

}
