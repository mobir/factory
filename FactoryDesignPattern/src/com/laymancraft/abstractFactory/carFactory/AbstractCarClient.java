package com.laymancraft.abstractFactory.carFactory;

import com.laymancraft.abstractFactory.carFactory.factoryImpl.AudiAbstractFactory;
import com.laymancraft.abstractFactory.carFactory.factoryImpl.VolkswagenAbstractFactory;
import com.laymancraft.abstractFactory.carFactory.parts.Chassis;
import com.laymancraft.abstractFactory.carFactory.parts.Engine;
import com.laymancraft.abstractFactory.carFactory.parts.FuelTank;
import com.laymancraft.abstractFactory.carFactory.parts.GearBox;

public class AbstractCarClient {

	public static void main(String[] args) {
		AutomobilePartsFactory abstractFactory = new VolkswagenAbstractFactory();
		// these producst are from Volkswagen Factory
		Chassis makeChassis = abstractFactory.makeChassis();
		Engine makeEngine = abstractFactory.makeEngine();
		FuelTank makeFuelTank = abstractFactory.makeFuelTank();
		GearBox makeGearBox = abstractFactory.makeGearBox();

		abstractFactory = new AudiAbstractFactory();
		// these producst are from Audi Factory
		makeChassis = abstractFactory.makeChassis();
		makeEngine = abstractFactory.makeEngine();
		makeFuelTank = abstractFactory.makeFuelTank();
		makeGearBox = abstractFactory.makeGearBox();

	}

}
