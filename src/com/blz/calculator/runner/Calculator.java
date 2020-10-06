package com.blz.calculator.runner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Calculator calci = new Calculator();
		int sum = calci.add(10, 20);
		System.out.println("Addition: " + sum);
	}

	private int add(int numOne, int numTwo) {
		int addition = 0;
		addition = numOne + numTwo;
		return addition;
	}
}
