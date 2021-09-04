package com.laymancraft.abstractFactory.carFactory;

import com.laymancraft.abstractFactory.carFactory.parts.Chassis;
import com.laymancraft.abstractFactory.carFactory.parts.Engine;
import com.laymancraft.abstractFactory.carFactory.parts.FuelTank;
import com.laymancraft.abstractFactory.carFactory.parts.GearBox;

public interface AutomobilePartsFactory {
	
	Engine makeEngine();
	
	FuelTank makeFuelTank();
	
	GearBox makeGearBox();
	
	Chassis makeChassis();

}
