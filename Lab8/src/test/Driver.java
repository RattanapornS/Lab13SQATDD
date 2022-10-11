package test;

//import main.UniversalConverter;

/*
 * A driver for testing the UniveralConverter class
 * 
 * @author Asst.Prof.Chitsutha Soomlek, College of Computing, KKU
 * @version 1.0
 */

public class Driver {

	/*
	 * The entry point to the UniversalConverter class
	 * 
	 * @parameter args = command-line arguments
	 */
	
	public static void main(String[] args)
	{
		/////results of the universal converter/////
		double originalValueD = 20.0;
		double convertedValueD = 0.0;	
		String selectedChoiceD = "Distance";
		String fromD = "kilometer";
		String toD = "meter";
		
		UniversalStub converterD = new UniversalStub();
		
		convertedValueD = converterD.convert(originalValueD, selectedChoiceD, fromD, toD);
		System.out.println(originalValueD + " " + fromD + " = " + convertedValueD + " " + toD);
		
	/////results of the universal converter/////
			double originalValueT = 20.0;
			double convertedValueT = 0.0;	
			String selectedChoiceT = "Temperature";
			String fromT = "C";
			String toT = "D";
			
			UniversalStub converterT = new UniversalStub();
			
			convertedValueT = converterT.convert(originalValueT, selectedChoiceT, fromT, toT);
			System.out.println(originalValueT + " " + fromT + " = " + convertedValueT + " " + toT);
			
		/////results of the universal converter/////
			double originalValueW = 20.0;
			double convertedValueW = 0.0;	
			String selectedChoiceW = "Weight";
			String fromW = "kilogram";
			String toW = "gram";
			
			UniversalStub converterW = new UniversalStub();
			
			convertedValueW = converterW.convert(originalValueW, selectedChoiceW, fromW, toW);
			System.out.println(originalValueW + " " + fromW + " = " + convertedValueW + " " + toW);
		
		/////results of the Distance converter/////
		double originalValue1 = 10.0;
		double convertedValue1 = 0.0;
		double Multiplier1 = 0.0;
			String from1 = "kilometer";
			String to1 = "meter";
			
			DistanceStub converter1 = new DistanceStub();
			
			convertedValue1 = converter1.convert(originalValue1,  from1, to1);
			Multiplier1 = converter1.getMultiplier(from1, to1);
			System.out.println(originalValue1 + " " + from1 + " = " + convertedValue1 + " " + to1);
			System.out.println("Multiplier = "+Multiplier1+"\n");
		
		/////results of the Temperature converter/////
		double originalValue2 = 10.0;
		double convertedValue2 = 0.0;	
		String from2 = "C";
		String to2 = "K";
		
		TemperatureStub converter2 = new TemperatureStub();
		
		convertedValue2 = converter2.convert(originalValue2, from2, to2);
		System.out.println(originalValue2 + " " + from2 + " = " + convertedValue2 + " " + to2);
		
		/////results of the Weight converter/////
		double originalValue3 = 10.0;
		double convertedValue3 = 0.0;
		double Multiplier3 = 0.0;
		String from3 = "kilogram";
		String to3 = "gram";
		
		WeightStub converter3 = new WeightStub();
		
		convertedValue3 = converter3.convert(originalValue3,  from3, to3);
		Multiplier3 = converter3.getMultiplier(from3, to3);
		System.out.println(originalValue3 + " " + from3 + " = " + convertedValue3 + " " + to3);
		System.out.println("Multiplier = "+Multiplier3+"\n");
	}
	
}