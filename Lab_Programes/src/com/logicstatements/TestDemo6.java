package com.logicstatements;
import java.util.Scanner;
public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter exam marks");
		int marks=sc.nextInt();
		if(marks>=50)
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail"); 
		}
System.out.println("main method ended");
	}

}
