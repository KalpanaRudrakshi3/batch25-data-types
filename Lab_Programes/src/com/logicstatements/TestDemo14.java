package com.logicstatements;
import java.util.Scanner;
public class TestDemo14 {

	public static void main(String[] args) {
	System.out.println("main method started");	
	Scanner sc=new Scanner(System.in);
	System.out.println("password");
	int pin=sc.nextInt();
	if(pin==1234) {
		System.out.println("pin is correct"); 
	}
	else {
		System.out.println("pin is wrong");
	}
	System.out.println("main method ended");
	}

}
