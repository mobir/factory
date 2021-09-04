package com.laymancraft.simpleFactory.pulpMaker;

import com.laymancraft.simpleFactory.pulpExtractor.PulpExtractor;

public class PulpMaker {

	public void extractPulp(String fruit) throws Exception {
		PulpExtractor pulpExtractor = SimpleStaticPulpFactory.createPulpExtractor(fruit);
		
		pulpExtractor.peel();
		
		pulpExtractor.removeSeed();
		
		pulpExtractor.separatePulp();
	}

}
