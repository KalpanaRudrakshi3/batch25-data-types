package com.operators;
//Assignment operators
// = += -= *= /= %=
public class TestDemoOperators3 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int result= 5;
		//result = result + 4.5;//type mismatch: cannot convert from double to int
		//result = (int)(result + 4.5);//9
		
		result += 4.5;//result=result + 4.5
		System.out.println("result is:"+ result);//9 
		
		//result = result-3.5;
		result -= 3.5;
		System.out.println("result is:"+ result);
		
		
		result *=7;
		System.out.println("result is:"+ result);
		
		result /=8.6;
		System.out.println("result is:"+ result);
		
		
		result %= 9;
		System.out.println("result is:"+ result);
		
		
		
	}

}
