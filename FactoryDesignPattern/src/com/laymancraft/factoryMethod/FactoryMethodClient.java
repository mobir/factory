package com.laymancraft.factoryMethod;

import com.laymancraft.factoryMethod.pulpMaker.PulpMaker;
import com.laymancraft.factoryMethod.pulpMaker.impl.ApplePulpMaker;
import com.laymancraft.factoryMethod.pulpMaker.impl.MangoPulpMaker;
import com.laymancraft.factoryMethod.pulpMaker.impl.OrangePulpMaker;

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
