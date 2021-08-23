package abstractFactory;

import abstractFactory.fruitPulpFactory.PulpInstruments;
import abstractFactory.fruitPulpFactory.impl.ApplePulpInstruments;
import abstractFactory.fruitPulpFactory.impl.MangoPulpInstruments;
import abstractFactory.fruitPulpFactory.impl.OrangePulpInstruments;
import abstractFactory.pulpExtractor.PulpExtractor;
import abstractFactory.pulpExtractor.impl.PulpExtractorImpl;

public class AbstractFactoryClient {
	
	public static void main(String[] args) throws Exception {
		
		PulpInstruments applePulpInstruments = new ApplePulpInstruments();
		PulpExtractor pulpExtractor = new PulpExtractorImpl(applePulpInstruments);
		PulpMaker pulpMaker = new PulpMaker(pulpExtractor);
		pulpMaker.extractPulp();
		
		PulpInstruments orangePulpInstruments = new OrangePulpInstruments();
		pulpExtractor = new PulpExtractorImpl(orangePulpInstruments);
		pulpMaker = new PulpMaker(pulpExtractor);
		pulpMaker.extractPulp();	
		
	
		PulpInstruments mangoPulpInstruments = new MangoPulpInstruments();
		pulpExtractor = new PulpExtractorImpl(mangoPulpInstruments);
		pulpMaker = new PulpMaker(pulpExtractor);
		pulpMaker.extractPulp();
		
	}

}
