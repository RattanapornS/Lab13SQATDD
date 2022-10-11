package com.example.FizzBuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class FizzBuzzApplicationTests {
	@Test
	public void Input1ShouldBe1() {
		String expected = "1";
		int number = 1;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}
	
	@Test
	public void Input2ShouldBe2() {
		String expected = "2";
		int number = 2;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}

	@Test
	public void Input3ShouldBeFizz() {
		String expected = "Fizz";
		int number = 3;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}

	@Test
	public void Input4ShouldBe4() {
		String expected = "4";
		int number = 4;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}

	@Test
	public void Input5ShouldBeBizz() {
		String expected = "Buzz";
		int number = 5;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}

	@Test
	public void Input15ShouldBeFizzBizz() {
		String expected = "FizzBuzz";
		int number = 15;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}

	@Test
	public void Input30ShouldBeFizzBizz() {
		String expected = "FizzBuzz";
		int number = 30;

		FizzBuzzApplication fizzBuzz = new FizzBuzzApplication();
		String actual = fizzBuzz.convert(number);
		
		assertEquals(expected,actual);
	}


	



}
