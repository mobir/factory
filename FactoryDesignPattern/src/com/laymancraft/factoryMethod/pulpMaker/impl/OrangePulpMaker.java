package com.laymancraft.factoryMethod.pulpMaker.impl;

import com.laymancraft.factoryMethod.pulpExtractor.PulpExtractor;
import com.laymancraft.factoryMethod.pulpExtractor.impl.OrangePulpExtractor;
import com.laymancraft.factoryMethod.pulpMaker.PulpMaker;

public class OrangePulpMaker extends PulpMaker {

	@Override
	public PulpExtractor createPulpExtractor() throws Exception {
		return new OrangePulpExtractor();
	}

}
