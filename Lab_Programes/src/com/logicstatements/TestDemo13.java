package com.logicstatements;
import java.util.Scanner;
public class TestDemo13 {

	public static void main(String[] args) {
		System.out.println("main method ended");
		Scanner sc=new Scanner(System.in);
		System.out.println("mobile charge");
		int charge=sc.nextInt();
		if(charge<20) {
			System.out.println("low charge");
		}
		else {
			
		System.out.println("high charge");
		}
		System.out.println("main method ended");
	}

}
