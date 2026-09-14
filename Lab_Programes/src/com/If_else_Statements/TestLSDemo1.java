package com.If_else_Statements;
import java.util.Scanner;
public class TestLSDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		if(age<18) {
			System.out.println("your are  not eligible for vote");
		}
		
		System.out.println("enter your gender m/f m for male and f for female");
		String gender=sc.next();
		
		if(gender.equalsIgnoreCase("m")||gender.equalsIgnoreCase("f")) {
			System.out.println("enter your voter id to verify");
			int voterId=sc.nextInt();
			System.out.println(" below are the political parties you can vote for anyone you want ");
			System.out.println(" ID-1: bjp");
			System.out.println("ID-2: bjd");
			System.out.println("ID-3: congres"); 
			System.out.println("ID-4: lotus");
			System.out.println("------------------------------------------");
			System.out.println("enter party id no which you want to vote for");
			int id=sc.nextInt();
			if(id==1) {
				System.out.println("you are voting for bjp");
				}
			else if(id==2) {
				System.out.println("you are voting for bjp");
			}
			else if(id==3) {
				System.out.println("you are voting for congres");
			}
			else if(id==4) {
				System.out.println("you are voting for lotus");
			}
			else
			{
				System.out.println("you are sucesfull voted for nota");
			}
			
		}
	}

}
