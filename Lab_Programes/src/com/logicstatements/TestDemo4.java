package com.logicstatements;
import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc =new Scanner(System.in);
	System.out.println("enter your salary");
	double salary=sc.nextDouble();
	
	
	if(salary>=600000.00) {
		System.out.println("good job");
	}
	else {
		System.out.println("next time");
	}

	System.out.println("main method ended");
	}

}
