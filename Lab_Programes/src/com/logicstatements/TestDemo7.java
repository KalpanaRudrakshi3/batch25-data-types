package com.logicstatements;
import java.util.Scanner;
public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("even or odd");
		int num=sc.nextInt();
		if(num%2==0){
			System.out.println("if num is divided by 2 then it is even");
			
			
		}
		else
		{
			
			System.out.println("odd");
		}
		System.out.println("main method ended");
	}

}
