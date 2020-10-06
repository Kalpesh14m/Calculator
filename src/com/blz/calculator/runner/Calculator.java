package com.blz.calculator.runner;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Calculator calci = new Calculator();

		// Add
		int sum = calci.add(10, 20, 30);
		System.out.println("Addition: " + sum);

		// Sub
		int sub = calci.sub(10, 20);
		System.out.println("Sub: " + sub);

		// Mul
		int mul = calci.mul(10, 20);
		System.out.println("Mul: " + mul);

	}

	private int add(int numOne, int numTwo, int numThree) {
		int addition = 0;
		addition = numOne + numTwo + numThree;
		return addition;
	}

	private int sub(int numOne, int numTwo) {
		int sub = 0;
		sub = numOne - numTwo;
		return sub;
	}

	private int mul(int numOne, int numTwo) {
		int mul = 0;
		mul = numOne * numTwo;
		return mul;
	}

}
