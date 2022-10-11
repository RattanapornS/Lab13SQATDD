package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.ShiftCipher;

class ShiftCipherTest {

	ShiftCipher cipher = new ShiftCipher();

	@Test
	void test_shift1() {
		String result = cipher.shift("a", 3);
		assertEquals("invalid", result);
	}
	@Test
	void test_shift2() {
		String result = cipher.shift("W", 3);
		assertEquals("Z", result);
	}
	@Test
	void test_shift3() {
		String result = cipher.shift("A", 5);
		assertEquals("F", result);
	}
	@Test
	void test_shift4() {
		String result = cipher.shift("XY", 3);
		assertEquals("AB", result);
	}
	@Test
	void test_shift5() {
		String result = cipher.shift("AB", -3);
		assertEquals("XY", result);
	}

	@Test
	void test_shift6() {
		String result = cipher.shift("&", -6);
		assertEquals("invalid", result);
	}

	

}
