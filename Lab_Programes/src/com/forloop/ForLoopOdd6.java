package com.forloop;

public class ForLoopOdd6 {

	public static void main(String[] args) {
	System.out.println("main method started");
	for(int i=1; i<=50;i++) {
		if(i%2==1 && i!=0 ) {
			System.out.print(i+" ");
		}
	}
	System.out.println("main method ended");
	}

}
