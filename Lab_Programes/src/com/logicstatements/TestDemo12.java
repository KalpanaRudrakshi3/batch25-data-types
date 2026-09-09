package com.logicstatements;
import java.util.Scanner;

public class TestDemo12 {

	public static void main(String[] args) {
	System.out.println("main method started");
	Scanner sc=new Scanner(System.in);
	System.out.println(" current units");
	int units=sc.nextInt();
	if(units>100)
	{
		System.out.println("high bill");
	}
	else {
		System.out.println("low bill");
	}
	
	System.out.println("main method ended");
	}

}
