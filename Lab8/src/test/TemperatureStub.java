package test;

import main.TemperatureConverter;

public class TemperatureStub extends TemperatureConverter{
	
	//Convert from C to K
	@Override
	public double convert(double tempValue, String fromUnit, String toUnit) {
		return tempValue+273.15;
	}
	
}