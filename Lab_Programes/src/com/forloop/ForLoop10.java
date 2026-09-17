package com.forloop;

import java.util.Scanner;

public class ForLoop10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter a number");
		int n= sc.nextInt();
		boolean status =isPrefect(n);
		if(status) {
			System.out.println("the given no is perfect"); 
		}
		else
		{
			System.out.println("the given no is not perfect");
			
		}
		}
	static boolean isPrefect(int n) {
		boolean status= false;
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		
		if(sum==n) {
			status =true;
			
			
		}
		return status;
	}

}
