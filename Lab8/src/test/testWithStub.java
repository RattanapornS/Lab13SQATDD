package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testWithStub {
	
	@Test
	void testUniversalConverterDistance() {
		UniversalStub UstubD = new UniversalStub();
		double expectedResult = 35000;
		assertEquals(expectedResult, UstubD.convert(35, "Distance", "kilometer", "meter"));
	}

	@Test
	void testDistanceConverter() {
		DistanceStub Dstub = new DistanceStub();
		double expectedResult = 15000;
		assertEquals(expectedResult, Dstub.convert(15, "kilometer", "meter"));
	}
	
	@Test
	void testTemperatureConverter() {
		TemperatureStub Tstub = new TemperatureStub();
		double expectedResult = 323.15;
		assertEquals(expectedResult, Tstub.convert(50, "C", "K"));
	}
	
	@Test
	void testWeightConverter() {
		WeightStub Wstub = new WeightStub();
		double expectedResult = 20000;
		assertEquals(expectedResult, Wstub.convert(20, "kilogram", "gram"));
	}
	
	@Test
	void testDistanceConverterMultiplier() {
		DistanceStub Dstub = new DistanceStub();
		double expectedResult = 1000;
		assertEquals(expectedResult, Dstub.getMultiplier("kilometer", "meter"));
	}
	
	
	@Test
	void testWeightConverterMultiplier() {
		WeightStub Wstub = new WeightStub();
		double expectedResult = 1000;
		assertEquals(expectedResult, Wstub.getMultiplier("kilogram", "gram"));
	}

}
