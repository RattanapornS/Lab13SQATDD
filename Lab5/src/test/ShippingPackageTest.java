package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import main.ShippingPackage;


class ShippingPackageTest {

	@ParameterizedTest
	@MethodSource("Parameters")
	@DisplayName("Category Partition")
	void testcom(int l,int s, int b) {
		ShippingPackage sp = new ShippingPackage();
		int total =  sp.calculate(l, s, b);
		assertEquals(total,sp.calculate(l, s, b));
		System.out.println(total);
	}
	
	static Stream<Arguments> Parameters(){
		
		return Stream.of(
				Arguments.of(0,5,25) , Arguments.of(7,0,7) ,Arguments.of(1,5,16),
        		Arguments.of(1,2,15) , Arguments.of(-1,2,16) ,Arguments.of(3,-1,5),
        		Arguments.of(4,5,-1) , Arguments.of(4,-1,-1) ,Arguments.of(-1,5,-1),
        		Arguments.of(-1,-1,-1) 
        		
				);
	}
		


}

