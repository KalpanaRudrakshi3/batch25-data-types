package com.labprogrames;
//with return type and with parameters
//find area of triangle : 0.5*base*height
//find area of rectangle : length* breadth
// find area of square : side* side
// find area of circle : PI*r*r

import java.util.Scanner;

public class Areas {
	
void main(String[] args) {
		System.out.println("main method started");
		 Scanner sc = new Scanner(System.in);
		System.out.println("enter side");
		double side=sc.nextDouble();
		double  arofsq =findtheareaofsqure(side);
		System.out.println("area of square:"+arofsq);
		System.out.println("enter base ");
		double b=sc.nextDouble();
		System.out.println("enter height:");
		double h= sc. nextDouble();
		double aroftri= FindTheAreaOfTriangle(b,h);
		System.out.println("area of tri is: "+aroftri); 
		
	}
	double FindTheAreaOfTriangle(double base, double height) {
		System.out.println("find the area of triangle");
		double aroftri=0.5+base+height;
		return aroftri;
	
	}
	
	double FindTheOfRectangle(double length,double breadth) {
		System.out.println("Find the area of rectangle");
		double arofrt=length*breadth;
		return arofrt;	
	}
	double findtheareaofsqure(double side) {
		double arofsq=side*side;
		return arofsq;
		
	}
	 double areaofthecircle(double radius) {
		
		 return Math.PI*radius*radius;
		 
	 }
	
	
	
	
	
	
	

}
