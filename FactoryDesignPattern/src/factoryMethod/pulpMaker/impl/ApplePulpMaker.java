package factoryMethod.pulpMaker.impl;

import factoryMethod.pulpExtractor.PulpExtractor;
import factoryMethod.pulpExtractor.impl.ApplePulpExtractor;
import factoryMethod.pulpMaker.PulpMaker;

public class ApplePulpMaker extends PulpMaker {

	@Override
	public PulpExtractor createPulpExtractor() throws Exception {
		return new ApplePulpExtractor();
	}

}
