package com.If_else_Statements;
import java.util.Scanner;
public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your attendance");
		int attendance=sc.nextInt();
		System.out.println("enter your marks");
		int marks=sc.nextInt();
		
		
		
		if(attendance>=75 && marks>=40) {
			System.out.println("your are eligible for exam");
		}
		else if(attendance<75 && marks>40) {
			System.out.println("your are not eligible for exam");
			
		}
		else if(attendance>75 && marks<40) {
			System.out.println("your are not eligible for exam");
		}
		else
		{
			System.out.println("not eligible for exame due to low attendance and low marks");
		}
System.out.println("main method ended");
	}

}
