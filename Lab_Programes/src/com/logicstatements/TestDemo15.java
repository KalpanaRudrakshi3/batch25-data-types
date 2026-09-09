package com.logicstatements;
import java.util.Scanner;

public class TestDemo15 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
	System.out.println("mobile num");
		long num=sc.nextLong();
		if(num==10)
		{
			System.out.println("number is valid");
		}
		else {
		System.out.println("number is invalid");
	}
		System.out.println("main method ended");
	}
	

}
