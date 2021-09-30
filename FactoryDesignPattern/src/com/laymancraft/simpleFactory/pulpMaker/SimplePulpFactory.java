package com.laymancraft.simpleFactory.pulpMaker;

import com.laymancraft.simpleFactory.pulpExtractor.PulpExtractor;
import com.laymancraft.simpleFactory.pulpExtractor.impl.ApplePulpExtractor;
import com.laymancraft.simpleFactory.pulpExtractor.impl.MangoPulpExtractor;
import com.laymancraft.simpleFactory.pulpExtractor.impl.OrangePulpExtractor;

public class SimplePulpFactory {
	public PulpExtractor createPulpExtractor(String fruit) throws Exception {
		if(fruit.equals("apple")) {
			return new ApplePulpExtractor();
		} else if(fruit.equals("orange")) {
			return new OrangePulpExtractor();
		} else  if(fruit.equals("mango")){
			return new MangoPulpExtractor();
		} else {
			throw new Exception("No Pulp Extractor found");
		}
	}
}
