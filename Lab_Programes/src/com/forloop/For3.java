package com.forloop;

import java.util.Scanner;

public class For3 {

	public static void main(String[] args) { 
		System.out.println("main method stated");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n= sc.nextInt();
		int sum=0;
		System.out.println("main method ended"
				+ "");
	
	for(int i=1;i<=n;i++) {
		if(i%3==0 && i%5==0) {
			System.out.print(i+" ");
			sum = sum+i;
		}
		
	}
	
System.out.println("sum="+sum);
	
	}
}
