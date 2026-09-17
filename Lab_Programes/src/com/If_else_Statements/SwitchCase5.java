package com.If_else_Statements;

import java.util.Scanner;

public class SwitchCase5 {

	public static void main(String[] args) {

		System.out.println("welcome to vcube vegetable / fruit market");
		Scanner sc = new Scanner(System.in);
		double totalPrice=0;
		double vegPrice = 0;
		double fruPrice=0;
		
		String yn=" ";
		System.out.println("enter the category");
		String catg = sc.next();
		do {

		switch (catg) {
		case "veg" -> {
			String vyn = "";
			
			do {
				System.out.println("enter a item");
				String item = sc.next();

				switch (item) {

				case "potato" -> {
					System.out.println("The potato per kg is 40rs");
					double potatoPrice = 40.0;
					vegPrice = vegPrice + potatoPrice;
				}

				case "onion" -> {
					System.out.println("The onion per kg is 45rs");
					double onionPrice = 45.0;
					vegPrice = vegPrice + onionPrice;
				}

				case "carrot" -> {
					System.out.println("The carrot per kg is 60rs");
					double carrotPrice = 60.0;
					vegPrice = vegPrice + carrotPrice;
				}

				case "brinjal" -> {
					System.out.println("The brinjal per kg is 35rs");
					double brinjalPrice = 35.0;
					vegPrice = vegPrice + brinjalPrice;
				}

				case "cabbage" -> {
					System.out.println("The cabbage per kg is 30rs");
					double cabbagePrice = 30.0;
					vegPrice = vegPrice + cabbagePrice;
				}
				default -> System.out.println("entered vegetable iteam is not available:");

				}
				System.out.println(" do you want to continue with vegetable click y or n");
				vyn = sc.next();
			} while (vyn.equalsIgnoreCase("y"));
			System.out.println("exit  from the vegetables");
			System.out.println("total vegetables price is:" + vegPrice);

		}

		case "fru" -> {
			
			String fyn=" ";
			
			do {
				System.out.println("enter fruit name:");
				String item = sc.next();
				switch (item) {
				
				case "apple" -> {
				    System.out.println("apple kg price is 150 rs");
				    double applePrice = 150.0;
				    fruPrice = fruPrice + applePrice;
				}

				case "banana" -> {
				    System.out.println("banana kg price is 60 rs");
				    double bananaPrice = 60.0;
				    fruPrice = fruPrice + bananaPrice;
				}

				case "mango" -> {
				    System.out.println("mango kg price is 100 rs");
				    double mangoPrice = 100.0;
				    fruPrice = fruPrice + mangoPrice;
				}

				case "grapes" -> {
				    System.out.println("grapes kg price is 90 rs");
				    double grapesPrice = 90.0;
				    fruPrice = fruPrice + grapesPrice;
				}

				case "papaya" -> {
				    System.out.println("papaya kg price is 70 rs");
				    double papayaPrice = 70.0;
				    fruPrice = fruPrice + papayaPrice;
				}
				default ->{
					System.out.println("entered fruit is not available right now");
				}
				}
				System.out.println("do you want to continue with fruits..?");
				fyn=sc.next();
			}while(fyn.equalsIgnoreCase("y"));
			System.out.println("exit from the fruits");
			System.out.println("total fruits price is:"+ fruPrice);
			
		}
		
		default -> System.out.println("entered catengory is not available right now");

		}
		System.out.println("Do you want to continue with the Categories Click Y ot N for EXit ..?");
		 yn = sc.next();
		
	
	}while(yn.equalsIgnoreCase("y"));
		
		System.out.println("Total Price is : " + (vegPrice + fruPrice));

	}
	
}
