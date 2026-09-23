package com.while2;

import java.util.Scanner;
//WAP to  check the given number is palindrome or not....
//input=123
//output=false

//input=454
//output=true

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		 boolean status = isPlain(n);
		if(status) {
			System.out.println("the given num is palindrome:");
		}
		else {
			System.out.println("the given num is not palindrome");
		}
	}
		 static boolean isPlain(int n) {
			boolean status=false;
			int r=0;
			int rev=0;
			int temp=n;
			
			while(n>0) {
				r=n%10;
				n=n/10;
				rev=rev*10+r;
			}
			if(rev==temp)
			status = true;
			
			return status;
		
	}

}
