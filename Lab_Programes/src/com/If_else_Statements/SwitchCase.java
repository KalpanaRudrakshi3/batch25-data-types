package com.If_else_Statements;
import java.util.Scanner;
 //switchcase excepting int , string eum
public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a jersey number");
		int  jno=sc.nextInt();
		
		switch(jno) {
	
		case 1:
		System.out.println(" mahendra singh dhoni");
		System.out.println("cool captian");
		System.out.println(" greate wicket keeper");
		
		
		case 18:
			System.out.println("virat kohli + jersey number is 18");
			System.out.println("consistent batsman");
			System.out.println("king kohli");
			break;
			
		case 45:
			System.out.println("rohit sharma+ jersey number is 45");
			System.out.println(" good captain & good batsman");
			break;
			
		case 3:
			System.out.println("vaibhav sooryavamsi+ jersey is 3");
			System.out.println("buddodu gattiodu !!");
			break;
			 default:
			 System.out.println("entered  jersey is not my favorite ");
			
		}
		System.out.println("main method ended");
		
	}

}
