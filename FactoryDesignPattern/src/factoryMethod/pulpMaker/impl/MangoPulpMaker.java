package factoryMethod.pulpMaker.impl;

import factoryMethod.pulpExtractor.PulpExtractor;
import factoryMethod.pulpExtractor.impl.MangoPulpExtractor;
import factoryMethod.pulpMaker.PulpMaker;

public class MangoPulpMaker extends PulpMaker {

	@Override
	public PulpExtractor createPulpExtractor() throws Exception {
		return new MangoPulpExtractor();
	}

}
