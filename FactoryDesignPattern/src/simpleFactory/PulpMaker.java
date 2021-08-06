package simpleFactory;

import common.PulpExtractor;

public class PulpMaker {

	public void extractPulp(String fruit) {
		PulpExtractor pulpExtractor = SimpleStaticPulpFactory.createPulpExtractor(fruit);
		
		pulpExtractor.wash();
		
		pulpExtractor.peel();
		
		pulpExtractor.extract();
	}

}
