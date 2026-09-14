package com.If_else_Statements;

import java.util.Scanner;

public class SwitchCase411 {

	public static void main(String[] args) {

		System.out.println(" main method started");
		String yn = "";

		do {

			Scanner sc = new Scanner(System.in);

			System.out.println("enter a first number:");
			double d1 = sc.nextDouble();
			System.out.println("enter a second number");
			double d2 = sc.nextDouble();
			System.out.println("enter a symbol like + _ * ? %");
			String symb = sc.next();

			switch (symb) {
			case "+" -> System.out.println("sum of two numbers is:" + (d1 + d2));
			case "-" -> System.out.println("sum of the numers is:" + (d1 - d2));
			case "*" -> System.out.println("sum of two numbers is:" + (d1 + d2));
			case "/" -> System.out.println("sum of the numers is:" + (d1 - d2));
			case "%" -> System.out.println("sum of two numbers is:" + (d1 + d2));

			default -> System.out.println("entered value is not valid ");

			}
			System.out.println("do you want to continue...? click y for yes or click n for no");
			yn = sc.next();

		} while (yn.equalsIgnoreCase("y"));
		System.out.println("you clicked for exit!!");
	}

}
