package abstractFactory.fruitPulpFactory;

import abstractFactory.fruitPulpProducts.Peeler;
import abstractFactory.fruitPulpProducts.PulpSeparator;
import abstractFactory.fruitPulpProducts.SeedRemover;

public interface PulpInstruments {
	// Factory of Product Family
	
	Peeler getPeeler();
	
	SeedRemover getSeedRemover();
	
	PulpSeparator getPulpSeparator();

}
