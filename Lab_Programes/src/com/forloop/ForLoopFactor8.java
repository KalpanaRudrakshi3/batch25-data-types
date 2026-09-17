package com.forloop;

import java.util.Scanner;

public class ForLoopFactor8 {

	public static void main(String[] args) {
		System.out.println("main method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		findFactors(n);
		System.out.println("main method ended");
	}
		
		static void findFactors(int n) {
			
		
		for(int i=1; i<=n; i++) {
			
			if(n%i==0 && i!=0) {
				System.out.print(i+" ");
			}
		}
		
		}
	
}
