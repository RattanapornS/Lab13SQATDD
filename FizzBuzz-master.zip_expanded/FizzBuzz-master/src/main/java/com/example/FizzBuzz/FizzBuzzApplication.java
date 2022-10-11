package com.example.FizzBuzz;


import org.springframework.boot.SpringApplication;

	public class FizzBuzzApplication {
		public static void main(String[] args) {
			SpringApplication.run(FizzBuzzApplication.class, args);
		}
	public String convert(final int number) {
		
		if(canDivideBy(number, 3) && canDivideBy(number, 5)) return "FizzBuzz";
		if(canDivideBy(number, 5)) return "Buzz";
		if(canDivideBy(number, 3)) return "Fizz";

		return String.valueOf(number);
	}

	private Boolean canDivideBy(int number, int devider){
		return number % devider == 0;
	}
}
