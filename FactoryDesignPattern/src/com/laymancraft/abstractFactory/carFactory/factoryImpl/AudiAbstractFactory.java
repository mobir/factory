package com.laymancraft.abstractFactory.carFactory.factoryImpl;

import com.laymancraft.abstractFactory.carFactory.AutomobilePartsFactory;
import com.laymancraft.abstractFactory.carFactory.parts.Chassis;
import com.laymancraft.abstractFactory.carFactory.parts.Engine;
import com.laymancraft.abstractFactory.carFactory.parts.FuelTank;
import com.laymancraft.abstractFactory.carFactory.parts.GearBox;
import com.laymancraft.abstractFactory.carFactory.parts.impl.audi.AudiChassis;
import com.laymancraft.abstractFactory.carFactory.parts.impl.audi.AudiEngine;
import com.laymancraft.abstractFactory.carFactory.parts.impl.audi.AudiFuelTank;
import com.laymancraft.abstractFactory.carFactory.parts.impl.audi.AudiGearBox;

public class AudiAbstractFactory implements AutomobilePartsFactory {

	@Override
	public Engine makeEngine() {
		return new AudiEngine();
	}

	@Override
	public FuelTank makeFuelTank() {
		return new AudiFuelTank();
	}

	@Override
	public GearBox makeGearBox() {
		return new AudiGearBox();
	}

	@Override
	public Chassis makeChassis() {
		return new AudiChassis();
	}

}
