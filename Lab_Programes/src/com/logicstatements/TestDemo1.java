package com.logicstatements;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age");
		int age= sc.nextInt();
		 if(age>=18) {
			 System.out.println("your are fit");
			 System.out.println("your are fit for driving and voting");
		 }else
		 {
			 System.out.println("your are not fit");
			 System.out.println("sorry");
			 
			 
			 
		 }
		 System.out.println("main method ended");

	}

}
