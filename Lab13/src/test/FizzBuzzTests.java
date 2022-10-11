package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTests {
	   @Test
	   public void Input1ShouldBe1() {
	      String expected = "1";
	      int number = 1;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
	   @Test
	   public void Input2ShouldBe2() {
	      String expected = "1";
	      int number = 1;
	      FizzBuzz fizzBuzz = new FizzBuzz();
	      String actual = fizzBuzz.convert(number);
	      assertEquals(expected,actual);
	   }
}