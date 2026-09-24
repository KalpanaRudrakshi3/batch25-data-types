package com.while2;

import java.util.Scanner;

public class SumofdigitsatEvenPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=sc.nextInt();
		int sum=0;
		int position =1;
		  while(n>0) {
			  int digit = n%10;
			  if(position%2==0) {
				  sum = sum+digit;
			  }
			  position++;
			  n=n/10;
		  }
		 System.out.println("sum of digits at even position is:"+sum);
		
		
		
	}

}



//output:enter a num:
//12345
//sum od digits at even position is:6

