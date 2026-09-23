package com.while2;

import java.util.Scanner;

//WAP to print sum of the digits from given number;
//input=2345
//output=14

public class SumOfTheDigits {

 void main() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		
		int sumOfDigits=sumOfDigits(n);
		System.out.println("sum of the digits:"+sumOfDigits);
		
		
	}
	int sumOfDigits(int n) {
		int sum=0;
		int r=0;
		 while(n>0) {
			 r=n%10;
			 n=n/10;
			 sum=sum+r;
		 }
		return sum;
	}
	
	
	
	

}
