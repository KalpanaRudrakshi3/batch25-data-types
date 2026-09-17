package com.operators;

import java.util.Scanner;

// Arithmetic Operators
//+ - * / %

public class TestDemoOperators {

	void main(String[] args) {
		System.out.println(" main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");
		float a1= sc.nextFloat();
		
		System.out.println("enter second number");
		double a2= sc.nextDouble();

		double sum=addition(a1,a2);
		System.out.println("sum of two numbers are:"+ sum);
		
	}
	
	 
	double addition(float a, double b) {
		 double sum= a+b;
		 return sum;
		
		

	}

}
