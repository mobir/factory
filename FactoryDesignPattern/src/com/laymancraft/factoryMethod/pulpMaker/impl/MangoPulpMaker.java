package com.laymancraft.factoryMethod.pulpMaker.impl;

import com.laymancraft.factoryMethod.pulpExtractor.PulpExtractor;
import com.laymancraft.factoryMethod.pulpExtractor.impl.MangoPulpExtractor;
import com.laymancraft.factoryMethod.pulpMaker.PulpMaker;

public class MangoPulpMaker extends PulpMaker {

	@Override
	public PulpExtractor createPulpExtractor() throws Exception {
		return new MangoPulpExtractor();
	}

}
