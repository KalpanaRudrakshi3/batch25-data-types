package com.logicstatements;
import java.util.Scanner;

public class TestDemo5 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int num=sc.nextInt();
		 if(num>=0) {
			 System.out.println("positive");
			 
		 }else
		 {
			 System.out.println("negative");
		 }
System.out.println("main method ended");
	}

}
