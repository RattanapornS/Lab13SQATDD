package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.RomanNumberConverter;

class RomanNumberConverterTest {
	
	RomanNumberConverter RomanCon;
	
	@BeforeEach
	void Setup() {
		
		RomanCon = new RomanNumberConverter();
	}
	@Test
	@DisplayName("TS01: 1 roman number")
	void testcase1() {
		assertAll(
				() -> assertEquals(5, RomanCon.asArabic("V")),
				() -> assertEquals(50, RomanCon.asArabic("L")),
				() -> assertEquals(500, RomanCon.asArabic("D"))
			);
	}
	@Test
	@DisplayName("TS02: 2 roman number (front is less than)")
	void testcase2() {
		assertAll(
				() -> assertEquals(4, RomanCon.asArabic("IV")),
				() -> assertEquals(40, RomanCon.asArabic("XL")),
				() -> assertEquals(400, RomanCon.asArabic("CD"))
			);
	}
	
	@Test
	@DisplayName("TS03: 1 roman number (put in letters)")
	void testcase3() {
		assertAll(
				() -> assertEquals("NULL", RomanCon.asArabic("A")),
				() -> assertEquals("NULL", RomanCon.asArabic("B")),
				() -> assertEquals("NULL", RomanCon.asArabic("Z"))
			);
	}
	
	@Test
	@DisplayName("TS04: 2 roman number (front is more than)")
	void testcase4() {
		assertAll(
				() -> assertEquals(15, RomanCon.asArabic("XV")),
				() -> assertEquals(51, RomanCon.asArabic("LI")),
				() -> assertEquals(505, RomanCon.asArabic("DV"))
			);
	}

	@Test
	@DisplayName("TS05: 3 roman number (front is more than)")
	void testcase5() {
		assertAll(
				() -> assertEquals(16, RomanCon.asArabic("XVI")),
				() -> assertEquals(160, RomanCon.asArabic("CLX")),
				() -> assertEquals(601, RomanCon.asArabic("DCI"))
			);
	}

	
}