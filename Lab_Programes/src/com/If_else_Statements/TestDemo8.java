package com.If_else_Statements;

import java.util.Scanner;
public class TestDemo8 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter skill level");
		int skillLevel= sc.nextInt();
		 System.out.println("enter correctcode");
		 int correctcode=sc.nextInt();
		  System.out.println("enter invalid");
		  int invalid=sc.nextInt();
		  
		  if(skillLevel>=80 && correctcode==1 && invalid==1) {
			 System.out.println("Mission Approved! You are ready for the spy mission.");
		  }
		  else if(skillLevel>=60 && correctcode==1 && invalid==1) {
			  System.out.println("Mission Approved with Medium Security");
		  }
		  else if(skillLevel<60 && correctcode==0 && invalid==1)
		  {
			  
			  System.out.println("Mission Rejected! Secret code is wrong");
		  }
	
	else {
		System.out.println("Mission Rejected! Security verification failed.");
	}

}
}

