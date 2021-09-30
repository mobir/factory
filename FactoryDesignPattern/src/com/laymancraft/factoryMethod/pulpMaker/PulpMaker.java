package com.laymancraft.factoryMethod.pulpMaker;

import com.laymancraft.factoryMethod.pulpExtractor.PulpExtractor;

public abstract class PulpMaker {

	public void extractPulp() throws Exception {
		PulpExtractor pulpExtractor = createPulpExtractor();
		
		pulpExtractor.peel();
		
		pulpExtractor.removeSeeds();
		
		pulpExtractor.separatePulp();
	}
	
	public abstract PulpExtractor createPulpExtractor() throws Exception;

}
