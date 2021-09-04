package com.laymancraft.abstractFactory.fruitFactory.pulpExtractor.impl;

import com.laymancraft.abstractFactory.fruitFactory.fruitPulpFactory.PulpInstruments;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.Peeler;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.PulpSeparator;
import com.laymancraft.abstractFactory.fruitFactory.fruitPulpProducts.SeedRemover;
import com.laymancraft.abstractFactory.fruitFactory.pulpExtractor.PulpExtractor;

public class PulpExtractorImpl implements PulpExtractor {
	private Peeler peeler;
	private SeedRemover seedRemover;
	private PulpSeparator pulpSeparator;
	
	public PulpExtractorImpl(PulpInstruments pulpInstruments) {
		this.peeler = pulpInstruments.getPeeler();
		this.seedRemover = pulpInstruments.getSeedRemover();
		this.pulpSeparator = pulpInstruments.getPulpSeparator();
	}

	@Override
	public void peel() {
		this.peeler.peelFruit();
	}
	
	@Override
	public void removeSeed() {
		this.seedRemover.removeSeed();
	}

	@Override
	public void separatePulp() {
		this.pulpSeparator.separatePulp();
	}

}
