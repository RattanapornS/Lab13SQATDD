package Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class labTestCase {
	labCase str_id;
	
	@BeforeEach
	public void setUp() {
		str_id = new labCase();
	}
	
	@Test
	void test() {
		int stdId = str_id.getID();
		assertEquals(633020564,str_id.idplus5(stdId));
	}
	
	
	
}

	