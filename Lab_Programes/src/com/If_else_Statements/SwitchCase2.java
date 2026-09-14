package com.If_else_Statements;

import java.util.Scanner;
// no break no :
public class SwitchCase2 {

	public static void main(String[] args) {

		System.out.println("welcome to vcube shopping mall");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your t-shirt size");
		int size = sc.nextInt();

		switch (size) {
		case 36 -> {
			System.out.println("based on your t-shirt number the size would small");
			System.out.println(" the price is 9999/-");
		}
		case 38 -> 
		{
			System.out.println("based on your t-shirt number the size would medium");
			System.out.println("the price is 3333/-");
		}

		case 40 -> System.out.println("based on your t-shirt number the size would large");

		case 42 -> System.out.println("based on your t-shirt number the sise would x-large");

		case 44 -> System.out.println("based on your t-shirt number the sise would x-large");

		default -> System.out.println("entered  t-shirt size is no availble!! ");

		}
		System.out.println("main method ended");

	}

}
