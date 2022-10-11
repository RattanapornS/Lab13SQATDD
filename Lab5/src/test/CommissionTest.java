package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.Commission;


class CommissionTest {

	@ParameterizedTest
	@MethodSource("Parameters")
	@DisplayName("Strong Robustness testing")
	void testcom(int l,int s, int b) {
		Commission commission = new Commission();
		Double total = commission.checkCommission(l, s, b);
		assertEquals(total,commission.checkCommission(l, s, b));
		System.out.println(total);
	}
	
	static Stream<Arguments> Parameters(){
		
		return Stream.of(
				Arguments.of(1,2,3) , Arguments.of(1,2,0) ,Arguments.of(1,2,91),
        		Arguments.of(3,0,4) , Arguments.of(3,0,0) ,Arguments.of(3,0,91),
        		Arguments.of(5,81,6) , Arguments.of(5,81,91) ,Arguments.of(5,81,0),
        		Arguments.of(-1,7,8) , Arguments.of(-1,7,0) ,Arguments.of(-1,7,91),
        		Arguments.of(-1,0,8) , Arguments.of(-1,-1,-1) ,Arguments.of(-1,0,91),
        		Arguments.of(-1,81,9) , Arguments.of(-1,81,-1) ,Arguments.of(-1,81,91),
        		Arguments.of(71,7,8) , Arguments.of(71,7,0) ,Arguments.of(71,7,91),
        		Arguments.of(71,0,9) , Arguments.of(71,0,-1) ,Arguments.of(71,0,91),
        		Arguments.of(71,81,9) , Arguments.of(71,81,0) ,Arguments.of(71,81,91)
        		
				);
	}
		

}