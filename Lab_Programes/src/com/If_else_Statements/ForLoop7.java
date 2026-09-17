package com.If_else_Statements;

public class ForLoop7 {

	public static void main(String[] args) {
		System.out.println("maim method started");
		int sum=0;
		for(int i=1; i<=50;i++ ) {
			
			if(i%3==0 && i%5==0) {
				 sum=sum+i;
				 
				 System.out.println(i);
			}
			
			
		}
		System.out.println(sum);
	}

}
