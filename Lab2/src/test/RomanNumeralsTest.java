package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.RomanNumerals;


class RomanNumeralsTest {
	
	
	RomanNumerals romanNumerals = new RomanNumerals();
	//Disabled
	@BeforeEach
	@Test
	@DisplayName("TC01")
	void test1 () {
	assertAll(() -> assertEquals(1,romanNumerals.convertRomanNumToInt("I")),
				() -> assertEquals(5,romanNumerals.convertRomanNumToInt("V")),
				() -> assertEquals(10,romanNumerals.convertRomanNumToInt("X")),
				() -> assertEquals(50,romanNumerals.convertRomanNumToInt("L")),
				() -> assertEquals(100,romanNumerals.convertRomanNumToInt("C")),
				() -> assertEquals(500,romanNumerals.convertRomanNumToInt("D"))
		);	
			
	}
	//Disabled
		@Test
		@DisplayName("TC02")
		void test2() {
			assertAll(() -> assertEquals(4,romanNumerals.convertRomanNumToInt("IV")),
					() -> assertEquals(9,romanNumerals.convertRomanNumToInt("IX")),
					() -> assertEquals(40,romanNumerals.convertRomanNumToInt("XL")),
					() -> assertEquals(90,romanNumerals.convertRomanNumToInt("XC")),
					() -> assertEquals(400,romanNumerals.convertRomanNumToInt("CD")),
					() -> assertEquals(900,romanNumerals.convertRomanNumToInt("CM"))
			);		
		}
		//Disabled
		@Test
		@DisplayName("TC03")
		void test3() {
			assertEquals(0,romanNumerals.convertRomanNumToInt("A"));
		
			assertAll(() -> assertEquals(0,romanNumerals.convertRomanNumToInt("A")),
					() -> assertEquals(0,romanNumerals.convertRomanNumToInt("B")),
					() -> assertEquals(0,romanNumerals.convertRomanNumToInt("Y")),
					() -> assertEquals(0,romanNumerals.convertRomanNumToInt("Z")),
					() -> assertEquals(0,romanNumerals.convertRomanNumToInt("E")),
					() -> assertEquals(0,romanNumerals.convertRomanNumToInt("W"))
			);	
		}
		//Disabled
		@Test
		@DisplayName("TC04")
		void test4() {
			assertAll(() -> assertEquals(6,romanNumerals.convertRomanNumToInt("VI")),
					() -> assertEquals(11,romanNumerals.convertRomanNumToInt("XI")),
					() -> assertEquals(15,romanNumerals.convertRomanNumToInt("XV")),
					() -> assertEquals(51,romanNumerals.convertRomanNumToInt("LI")),
					() -> assertEquals(101,romanNumerals.convertRomanNumToInt("CI")),
					() -> assertEquals(505,romanNumerals.convertRomanNumToInt("DV"))
					
			);		
		}
		//Disabled
		@Test
		@DisplayName("TC05")
		void test5() {
			assertAll(() -> assertEquals(2,romanNumerals.convertRomanNumToInt("II")),
					() -> assertEquals(20,romanNumerals.convertRomanNumToInt("XX")),
					() -> assertEquals(10,romanNumerals.convertRomanNumToInt("VV")),
					() -> assertEquals(100,romanNumerals.convertRomanNumToInt("LL")),
					() -> assertEquals(200,romanNumerals.convertRomanNumToInt("CC")),
					() -> assertEquals(2000,romanNumerals.convertRomanNumToInt("MM"))
			);		
		}
		//Disabled
		@Test
		@DisplayName("TC06")
		void test6() {
			assertAll(() -> assertEquals(16,romanNumerals.convertRomanNumToInt("XVI")),
					() -> assertEquals(65,romanNumerals.convertRomanNumToInt("LXV")),
					() -> assertEquals(160,romanNumerals.convertRomanNumToInt("CLX")),
					() -> assertEquals(650,romanNumerals.convertRomanNumToInt("DCL")),
					() -> assertEquals(601,romanNumerals.convertRomanNumToInt("DCI")),
					() -> assertEquals(1600,romanNumerals.convertRomanNumToInt("MDC"))
			);	
				
		}
	
}
