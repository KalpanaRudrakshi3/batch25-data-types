package com.operators;
// arithmetic operators
public class TestDemoOperators2 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("addition is:" + a + b);// 1020
		System.out.println("addition is--->SUM:" + (a + b));// 30
//System.out.println("subtraction is :"+ b-a);//The operator - is undefined for the argument type(s) String, int(compile time error)
		System.out.println("subtraction is--->Diff:" + (b - a));
		// BODMAS
		System.out.println("multiplication is  --->product" + a * b);

		int x = 98;
		int y = 4;
		// 4)98(24(Quotient /)
		// 96
		// ----------2 (reminder%)

		System.out.println("Division is--> quotient:" + x / y);
		System.out.println("modulus is--->Reminder:" + x % y);

	}

}
