package com.logicstatements;
import java.util.Scanner;
public class TestDemo17 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("room temp");
		int temp=sc.nextInt();
		if(temp>70) {
			System.out.println("room temp is high");
		}
		else 
		{
			System.out.println("romm temp is low");
		}
		System.out.println("main method ended");
	}
	


}
