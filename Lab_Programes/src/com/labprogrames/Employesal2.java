package com.labprogrames;

//with return type and no parameters


import java.util.Scanner;
public class Employesal2 {
	static Scanner sc=new Scanner(System.in);
	
	
	double getSalary() {
		System.out.println("enter your sal");
		double sal=sc.nextDouble();
		return sal;
		
		
	}
 double getHRA() {
	 System.out.println("enter your hra");
	 double hra=sc.nextDouble();
	 return hra;
 }
 
 double getBonus() {
	 System.out.println("enter your balance");
	 double bonus=sc.nextDouble();
	 return bonus;
	 
 }
 int addition() {
	 int a=10;
	 int b=20;
	 return a+b;

 }

	
void main(String[] args) {
		System.out.println("main method ended"); 
		 int sum=addition();
		 System.out.println(sum);
		 
		 double sal=getSalary();
		double hra=getHRA();
		 double  bonus=getBonus();
		 
		 System.out.println("total sal:"+sal+hra+bonus);
		 //bodmas
		 System.out.println("total sal:"+(sal+hra+bonus));
		
		System.out.println("main method ended");

	}

}
