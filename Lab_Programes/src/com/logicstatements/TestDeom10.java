package com.logicstatements;
import java .util.Scanner;
public class TestDeom10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("bill ");
		int bill=sc.nextInt();
		if(bill>1000)
		{
			System.out.println("they give discount");
		}
		else {
			System.out.println("otherwise no discount");
		}
		System.out.println("main method ended");

	}

}
