package com.forloop;

import java.util.Scanner;
//PerfectNumber
public class ForLoop9 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int nth=sc.nextInt();
		boolean Perfect= isPerfect(nth);
		 
		 if(Perfect) {
			 System.out.println("the given number is perfect"); 
		 }else {
			 System.out.println("the give number is not perfect");
		 }
		 
		 
	}
  static boolean isPerfect(int nth) {
     boolean isPerfect= false; 
int count=0;
int num=2;
 for(int i=1;i<=nth/2; i++) {
	 if(nth%i==0) {
		 count=count+1;
		 System.out.println(i);
	 }

	
	
 }
 if(count==nth) {
	 return true;
  }
 else {

	return false;
 }

}
  
}
