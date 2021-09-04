package com.laymancraft.simpleFactory.clientCode;

import com.laymancraft.simpleFactory.pulpMaker.PulpMaker;

public class SimpleFactoryClient {

	public static void main(String[] args) throws Exception {
		PulpMaker pulpMaker = new PulpMaker();
		pulpMaker.extractPulp("apple");
		pulpMaker.extractPulp("orange");
		pulpMaker.extractPulp("mango");
		
	}

}
