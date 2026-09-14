package com.If_else_Statements;
import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		 System.out.println("enter human balance diet ");
		
		 System.out.println("enter water intake per person");
		 int water=sc.nextInt();
		 
		 System.out.println("enter food intake");
		 int food=sc.nextInt();
		 
		
		 System.out.println("enter health condition");
		 int health=sc.nextInt();
		 
		 
		if(water>=40 && food>=50 && health>=60)
		{
			System.out.println("your health is good");
		}
		else if(water<=40 && food<=50 && health>=60){
			System.out.println("you have to take sufficent food and water");
		}
		else if(water<=40 && food>=50 && health<=60)
		{
			System.out.println("you have to take care of your health");
		}
		else {
			System.out.println("you died with health issues");
		}
		System.out.println("main method ended");
	}

}
