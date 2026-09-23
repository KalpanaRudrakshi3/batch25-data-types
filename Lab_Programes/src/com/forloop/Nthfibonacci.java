package com.forloop;

import java.util.Scanner;

public class Nthfibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		 for(int i=1;i<n;i++) {
			 int c=a+b;
			 a=b;
			 b=c;
		 }
System.out.println("nth fibonacci value is:"+a);
	}

}
