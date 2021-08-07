package factoryMethod.pulpMaker;

import factoryMethod.pulpExtractor.PulpExtractor;

public abstract class PulpMaker {

	public void extractPulp() throws Exception {
		PulpExtractor pulpExtractor = this.createPulpExtractor();
		
		pulpExtractor.wash();
		
		pulpExtractor.peel();
		
		pulpExtractor.extract();
	}
	
	public abstract PulpExtractor createPulpExtractor() throws Exception;

}
