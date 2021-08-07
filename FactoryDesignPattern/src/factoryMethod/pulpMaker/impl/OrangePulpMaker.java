package factoryMethod.pulpMaker.impl;

import factoryMethod.pulpExtractor.PulpExtractor;
import factoryMethod.pulpExtractor.impl.OrangePulpExtractor;
import factoryMethod.pulpMaker.PulpMaker;

public class OrangePulpMaker extends PulpMaker {

	@Override
	public PulpExtractor createPulpExtractor() throws Exception {
		return new OrangePulpExtractor();
	}

}
