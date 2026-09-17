package com.If_else_Statements;

import java.util.Scanner;

public class SwitchCase8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int day = sc.nextInt();
		String info = getDayInfo(day);
	
		System.out.println(info);
		System.out.println("main method ended");
	}

	private static String getDayInfo(int day){
		
	String  info=switch(day){
	case 1-> {
		
		System.out.println("it is holiday");
		yield "Sunday";
	}
	case 2->{
		System.out.println("lazy day");
		yield "monday";
	}
	case 3,4,5->{
		
		System.out.println("these are rotinue days");
		yield "twt";
	}
	
	default -> "not available";
	};

	return info;
}
}

