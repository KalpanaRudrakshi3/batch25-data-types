package com.If_else_Statements;
import java.util.Scanner;
public class DailyToDoList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time");
		int time=sc.nextInt();
		if(time==5&&time==6 ) {
			System.out.println("good morning");
		}
		else if(time==7&&time==8) {
			System.out.println("institue time");
		}
		else if(time>=8 && time>=12)
		{
			System.out.println("focus on class");
		}
		else if(time>=12 && time>=1 ) {
			System.out.println("lunch time");
		}
		else if(time<=2 && time>=5)
		{
			System.out.println("java  and sql learning");
		}
		
		else if(time==5 && time==6) {
			System.out.println("break");
		}
		else if(time==7 &&time==8)
		{
			System.out.println("family time");
		}
		else if(time<=8 && time<=9)
		{
			System.out.println("dinner time");
		}
		else if(time<=9 && time<=10) {
			System.out.println("sleep");
		}
		else {
			System.out.println("if you don't follow this daliy then you will went to sed");
		}
	}

}
