package com.laymancraft.abstractFactory.carFactory.factoryImpl;

import com.laymancraft.abstractFactory.carFactory.AutomobilePartsFactory;
import com.laymancraft.abstractFactory.carFactory.parts.Chassis;
import com.laymancraft.abstractFactory.carFactory.parts.Engine;
import com.laymancraft.abstractFactory.carFactory.parts.FuelTank;
import com.laymancraft.abstractFactory.carFactory.parts.GearBox;
import com.laymancraft.abstractFactory.carFactory.parts.impl.volkswagen.VolkswagenChassis;
import com.laymancraft.abstractFactory.carFactory.parts.impl.volkswagen.VolkswagenEngine;
import com.laymancraft.abstractFactory.carFactory.parts.impl.volkswagen.VolkswagenFuelTank;
import com.laymancraft.abstractFactory.carFactory.parts.impl.volkswagen.VolkswagenGearBox;

public class VolkswagenAbstractFactory implements AutomobilePartsFactory {

	@Override
	public Engine makeEngine() {
		return new VolkswagenEngine();
	}

	@Override
	public FuelTank makeFuelTank() {
		return new VolkswagenFuelTank();
	}

	@Override
	public GearBox makeGearBox() {
		return new VolkswagenGearBox();
	}

	@Override
	public Chassis makeChassis() {
		return new VolkswagenChassis();
	}

}
