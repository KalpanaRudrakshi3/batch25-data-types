package com.while2;

import java.util.Scanner;

public class GivenNumISstrongORnot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num=145");
		int n=sc.nextInt();
		int original=n;
		int sum=0;
		
		while(n>0)
		{
			int digit = n%10;
			int fact = 1;
			for(int i=1; i<=digit; i++) {
				fact=fact*i;
		}
			sum=sum+fact;
			n=n/10;
			
		}
		if(sum==original) {
			System.out.println("strong num");
		}
		else {
			
			System.out.println("not a strong num");
		}
	}

}








//output:enter a num=
//145
//strong num


