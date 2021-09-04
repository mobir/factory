package com.laymancraft.abstractFactory.fruitFactory;

import com.laymancraft.abstractFactory.fruitFactory.pulpExtractor.PulpExtractor;

public class PulpMaker {
	private PulpExtractor pulpExtractor;
	
	public PulpMaker(PulpExtractor pulpExtractor) {
		this.pulpExtractor = pulpExtractor;
	}

	public void extractPulp() throws Exception {
		
		pulpExtractor.peel();
		
		pulpExtractor.removeSeed();
		
		pulpExtractor.separatePulp();
	}

}
