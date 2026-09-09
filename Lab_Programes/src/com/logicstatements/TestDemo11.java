package com.logicstatements;
import java.util.Scanner;
public class TestDemo11 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("room sharing");
		int roomsharing=sc.nextInt();
		if(roomsharing>3) {
			System.out.println("price is low");
		}
		else {
			System.out.println("price is high");
		}
		System.out.println("main method ended");
		
	}

}
