package abstractFactory.fruitPulpProducts.orange;

import abstractFactory.fruitPulpProducts.PulpSeparator;

public class OrangePulpSeparator implements PulpSeparator {
	// Concrete Product of Orange Family
	
	@Override
	public void separatePulp() {
		System.out.println("separate orange pulp");
	}

}
