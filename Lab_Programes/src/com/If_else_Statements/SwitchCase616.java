package com.If_else_Statements;

import java.util.Scanner;

public class SwitchCase616 {

	public static void main(String[] args) {
		System.out.println("food order system");
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter menu card");
		String menu= sc.next();
		
		
		switch(menu) {
		case "piz" -> {System.out.println("enter an item");
		String item=sc.next();
		
		switch(item) {
		case "pizza"->{
			System.out.println(" per pizza price is 200");
			double pizzaPrice=200.0;
		}
		
		case "burger"->{
			System.out.println("per burger price is 120");
			double burgerPrice =120.0;
		}
		    
		case "biryani"->{
			System.out.println("per ");
		}
		
		}
		
		}
		
		}
		
		

	}

}
