package simpleFactory;

import common.ApplePulpExtractor;
import common.MangoPulpExtractor;
import common.OrangePulpExtractor;
import common.PulpExtractor;

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
