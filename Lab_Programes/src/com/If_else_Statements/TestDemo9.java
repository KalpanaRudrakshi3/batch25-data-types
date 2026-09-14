package com.If_else_Statements;
import java.util.Scanner;
public class TestDemo9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		 System.out.println("enter id");
		 int id=sc.nextInt();
	
		 System.out.println("enter password");
		 int password=sc.nextInt();
		 
		  System.out.println("enter  fingerprint");
		int fingerprint=sc.nextInt();
 if(id==1 && password==1 &&  fingerprint==1  ) {
	 System.out.println("Secret Lab Access Granted");
	}
	else if (id==1 && password==1 &&  fingerprint==0 )
	{
		System.out.println("Access Denied! Fingerprint does not match.");
	}
	else if(id==1 && password==0 &&  fingerprint==1) {
		System.out.println("Access Denied! Password is incorrect");
		
	}
	else {System.out.println("Access Denied! Security verification failed");
	
}
System.out.println("main method ended");

	}
}
