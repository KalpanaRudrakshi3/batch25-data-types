package com.If_else_Statements;

import java.util.Scanner;

public class ForLoop3 {

	public static void main(String[] args) {
		System.out.println("main method star");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n =sc.nextInt();
		System.out.println("main method ended");

		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.println(i);

			}
		}

	}

}
