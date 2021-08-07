package simpleFactory;

import simpleFactory.pulpExtractor.PulpExtractor;

public class PulpMaker {

	public void extractPulp(String fruit) throws Exception {
		PulpExtractor pulpExtractor = SimpleStaticPulpFactory.createPulpExtractor(fruit);
		
		pulpExtractor.peel();
		
		pulpExtractor.removeSeed();
		
		pulpExtractor.separatePulp();
	}

}
