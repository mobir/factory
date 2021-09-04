package com.laymancraft.abstractFactory.fruitFactory;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.PulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.impl.ApplePulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.impl.MangoPulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.impl.OrangePulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.pulpExtractor.PulpExtractor;
import com.laymancraft.abstractFactory.fruitFactory.pulpExtractor.impl.PulpExtractorImpl;

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
