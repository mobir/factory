package factoryMethod;

import factoryMethod.pulpMaker.PulpMaker;
import factoryMethod.pulpMaker.impl.ApplePulpMaker;
import factoryMethod.pulpMaker.impl.MangoPulpMaker;
import factoryMethod.pulpMaker.impl.OrangePulpMaker;

public class FactoryMethodClient {

	public static void main(String[] args) throws Exception {
		PulpMaker applePulpMaker = new ApplePulpMaker();
		applePulpMaker.extractPulp();
		
		PulpMaker orangePulpMaker = new OrangePulpMaker();
		orangePulpMaker.extractPulp();
		
		PulpMaker mangoPulpMaker = new MangoPulpMaker();
		mangoPulpMaker.extractPulp();
	}

}
