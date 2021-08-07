package abstractFactory.fruitPulpProducts.mango;

import abstractFactory.fruitPulpProducts.SeedRemover;

public class MangoSeedRemover implements SeedRemover {
	// Concrete Product of Mango Family
	
	@Override
	public void removeSeed() {
		System.out.println("remove mango seed");
	}


}
