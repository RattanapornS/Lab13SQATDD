package test;

import main.WeightConverter;

public class WeightStub extends WeightConverter{
	
	//Convert from kilogram to gram
	@Override
	public double convert(double massValue, String fromUnit, String toUnit) {
		return massValue*getMultiplier(fromUnit, toUnit);
	}
	
	@Override
	public double getMultiplier(String fromUnit, String toUnit) {
		return 1000.0;
	}
}