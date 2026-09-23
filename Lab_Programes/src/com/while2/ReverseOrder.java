package com.while2;

import java.util.Scanner;

//
public class ReverseOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int revnum=revnum(n);
		System.out.println(revnum);
	
		if(revnum==n) {
			System.out.println("given num is palindrome");
		}
	
		else {
			System.out.println("give num is not a palindrome");
		}
	}
		private static int revnum(int n) {
			int rev=0;
			int r=0;
			
			while(n>0) {
				r=n%10;
				n=n/10;
				rev=rev*10+r;
			}
		return rev;
	}

}
