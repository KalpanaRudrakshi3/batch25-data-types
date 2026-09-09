package com.logicstatements;
 import java.util.Scanner;
public class TestDemo3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter you fullname");
		String fullname= sc.nextLine();
		if(fullname.length()<=15) {
			System.out.println("your name is good");
			System.out.println("your name is added");
		}else {
			System.out.println("change your name");
			System.out.println("then your name is added");
		
		}
		
System.out.println("main method ended");
	}

}
