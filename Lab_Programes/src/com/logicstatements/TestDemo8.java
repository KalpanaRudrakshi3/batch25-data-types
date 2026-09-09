package com.logicstatements;
import java.util.Scanner;
public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("speed");
		int speed=sc.nextInt();
		if(speed>=60) {
			System.out.println("high speed");
		}
		else {
			System.out.println("normal speed");
		}
	
System.out.println("main method ended");
	}

}
