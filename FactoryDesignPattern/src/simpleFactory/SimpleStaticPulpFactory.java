package simpleFactory;

import simpleFactory.pulpExtractor.PulpExtractor;
import simpleFactory.pulpExtractor.impl.ApplePulpExtractor;
import simpleFactory.pulpExtractor.impl.MangoPulpExtractor;
import simpleFactory.pulpExtractor.impl.OrangePulpExtractor;

public class SimpleStaticPulpFactory {

	public static PulpExtractor createPulpExtractor(String fruit) throws Exception {
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
