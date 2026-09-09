package com.logicstatements;
import java.util.Scanner;
public class TestDemo16 {

	public static void main(String[] args) {
		System.out.println("main method started");
Scanner sc=new Scanner(System.in);
System.out.println("rain status");
boolean isRainning= sc.nextBoolean();
if(isRainning==true) {
	System.out.println("take umbrella");
}
else
{
	System.out.println("no need umbrella");
}
System.out.println("main method ended");
	}

}
