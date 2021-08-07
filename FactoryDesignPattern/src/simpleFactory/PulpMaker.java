package simpleFactory;

import simpleFactory.pulpExtractor.PulpExtractor;

public class PulpMaker {

	public void extractPulp(String fruit) {
		PulpExtractor pulpExtractor = SimpleStaticPulpFactory.createPulpExtractor(fruit);
		
		pulpExtractor.wash();
		
		pulpExtractor.peel();
		
		pulpExtractor.extract();
	}

}
