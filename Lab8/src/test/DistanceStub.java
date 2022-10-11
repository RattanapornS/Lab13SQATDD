package test;

import main.DistanceConverter;

public class DistanceStub extends DistanceConverter{
	
	//Convert from kilometer to meter
	@Override
	public double convert(double distanceValue, String fromUnit, String toUnit) {
		return distanceValue*getMultiplier(fromUnit, toUnit);
	}
	
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 1000.0;
	}
}