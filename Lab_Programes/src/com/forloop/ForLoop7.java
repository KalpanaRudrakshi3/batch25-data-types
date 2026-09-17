package com.forloop;

import java.util.Scanner;

public class ForLoop7 {

	public static void main(String[] args) {
		System.out.println("main started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		 for(int i=0; i<=n; i++) {
			 if(i%n==0 && i!=0 ) {
				 System.out.println(i);
			 }
		 }
		
		
		System.out.println(n);
		
	}

}
