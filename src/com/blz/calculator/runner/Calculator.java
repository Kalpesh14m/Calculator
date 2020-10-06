package com.blz.calculator.runner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Calculator calci = new Calculator();

		// Add
		int sum = calci.add(10, 20);
		System.out.println("Addition: " + sum);

		// Sub
		int sub = calci.sub(10, 20);
		System.out.println("Sub: " + sub);

	}

	private int add(int numOne, int numTwo) {
		int addition = 0;
		addition = numOne + numTwo;
		return addition;
	}

	private int sub(int numOne, int numTwo) {
		int sub = 0;
		sub = numOne - numTwo;
		return sub;
	}

}
