package com.If_else_Statements;
import java.util.Scanner;
public class TestDemo7 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("metro alert");
		
		
		System.out.println("enter distance ");
		int distance=sc.nextInt();
		
		System.out.println("enter speed");
		int speed=sc.nextInt();
		
		System.out.println("enter size of the metro");  
		int seats=sc.nextInt();
		
		if(distance>=90 && speed>=5000 && seats>=50) {
			System.out.println(" metro is well in condition ");
		}
		else if(distance>90 && speed<=5000 && seats<=50) {
			
			System.out.println("no risk");
		}
		else if(distance<100 && speed<7000 && seats<90) {
			System.out.println("over spped");
		}
		else {
			System.out.println(" if the metro speed is incresed more than above seep then the metro on risk");
		}
		System.out.println("main method ended");
		
		
	}

}
