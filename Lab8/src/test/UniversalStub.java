package test;

import main.UniversalConverter;

public class UniversalStub extends UniversalConverter{
	
	//Convert from kilometer to meter
	@Override
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		double result = 0.0;
		DistanceStub distanceConverter = new DistanceStub();
		WeightStub weightConverter = new WeightStub();
		TemperatureStub tempConverter = new TemperatureStub();
		
		if (choice.equals("Distance")) {
			result = distanceConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("Weight")) {
			result = weightConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("Temperature")) {
			result = tempConverter.convert(value, fromUnit, toUnit);
		}
			
		return result;
	}
}