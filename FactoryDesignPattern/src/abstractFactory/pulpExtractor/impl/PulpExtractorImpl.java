package abstractFactory.pulpExtractor.impl;

import abstractFactory.fruitPulpFactory.PulpInstruments;
import abstractFactory.fruitPulpProducts.Peeler;
import abstractFactory.fruitPulpProducts.PulpSeparator;
import abstractFactory.fruitPulpProducts.SeedRemover;
import abstractFactory.pulpExtractor.PulpExtractor;

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
