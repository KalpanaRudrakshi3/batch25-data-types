package com.logicstatements;
import java.util.Scanner;
public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("weight of the body");
		int weight=sc.nextInt();
		if(weight>=50)
		{
			System.out.println("over weight");
		}
		
		else {
			System.out.println("normal weight");
		}
System.out.println("main method ended");
	}

}
