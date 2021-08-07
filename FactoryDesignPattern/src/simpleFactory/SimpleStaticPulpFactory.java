package simpleFactory;

import simpleFactory.pulpExtractor.PulpExtractor;
import simpleFactory.pulpExtractor.impl.ApplePulpExtractor;
import simpleFactory.pulpExtractor.impl.MangoPulpExtractor;
import simpleFactory.pulpExtractor.impl.OrangePulpExtractor;

public class SimpleStaticPulpFactory {

	public static PulpExtractor createPulpExtractor(String fruit) {
		if(fruit.equals("apple")) {
			return new ApplePulpExtractor();
		} else if(fruit.equals("orange")) {
			return new OrangePulpExtractor();
		} else {
			return new MangoPulpExtractor();
		}
	}

}
