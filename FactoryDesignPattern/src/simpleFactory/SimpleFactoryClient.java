package simpleFactory;

public class SimpleFactoryClient {

	public static void main(String[] args) {
		PulpMaker pulpMaker = new PulpMaker();
		pulpMaker.extractPulp("apple");
		pulpMaker.extractPulp("orange");
		pulpMaker.extractPulp("mango");
		
	}

}
