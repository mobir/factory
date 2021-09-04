package com.laymancraft.nonFactory;

import com.laymancraft.nonFactory.pulpExtractor.PulpExtractor;
import com.laymancraft.nonFactory.pulpExtractor.impl.ApplePulpExtractor;
import com.laymancraft.nonFactory.pulpExtractor.impl.MangoPulpExtractor;
import com.laymancraft.nonFactory.pulpExtractor.impl.OrangePulpExtractor;

public class PulpMaker {
// This is a client code which uses pulp extractor interface/api to extractact pulp
	
	public void extractPulp(String fruit) throws Exception {
		PulpExtractor pulpExtractor;
		if(fruit.equals("apple")) {
			pulpExtractor = new ApplePulpExtractor();
		} else if(fruit.equals("orange")) {
			pulpExtractor = new OrangePulpExtractor();
		} else  if(fruit.equals("mango")){
			pulpExtractor = new MangoPulpExtractor();
		} else {
			throw new Exception("No Pulp Extractor found");
		}
		
		pulpExtractor.peel();
		
		pulpExtractor.removeSeed();
		
		pulpExtractor.separatePulp();
	}
	
	public static void main(String[] args) throws Exception {
		// This is a real client code, but dont think too much on this
		
		PulpMaker clientCode = new PulpMaker();
		clientCode.extractPulp("apple");
	}
}
