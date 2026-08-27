package com.labprogrames;

//20/8/26

import java.math.BigInteger;

import java.math.BigDecimal;  
import java.util.Scanner;


class Dog{
	
}

public class ObjectDataTypes {  
	//String is a class  from java.lang package and object data Types
	// string is a collection of characters storing into single variable with index
	String s= "java is simple";// string is a literal ---are stored in SCP--->String constant pool
	String s1=new String("srikanth");//string object-- are stored in --Heap Meory
BigInteger b;
BigInteger b3= new BigInteger("425355364652754827458754876835483254857475") ;
BigInteger b4= new BigInteger("425355364652754827458754876835483254857475") ;
Scanner sc =new Scanner(System.in);
//Type mismatch: cannot convert from int to BigInteger
//BigInteger b1=100;(invalid)
BigDecimal d= new BigDecimal("56432654655.546527457257254675245264675246757654526426"); 

Integer i=100;
Short sh;
Character c;

Dog dg;
//Dog dg="puppy"; (invalid)




	public static void main(String[] args) {
		System.out.println("main method started");
		
		
		ObjectDataTypes n=new ObjectDataTypes();
		System.out.println("String Value is:"+n.s);
		System.out.println("String Value is:"+n.s1);
		System.out.println("Scanner value is:"+n.sc);
		System.out.println("BigInteger  value is:"+n.b);
		System.out.println("BigInteger  value is:"+n.b3);
		System.out.println("BigInteger  value is:"+n.b4);
		System.out.println("BigInteger  value is:"+n.b);
		
		System.out.println(10+100);
//The operator + is undefined for the argument type(s) java.math.BigInteger, java.math.BigInteger
		//System.out.println(n.b3 + n.b4);
		System.out.println(n.b3.add(n.b4));//addition
		System.out.println(n.b3.multiply(n.b4));
		System.out.println("BigDecimal value is :"+n.d);
		System.out.println("Integer value is :"+n.i);
		System.out.println("Short value is :"+n.sh);
		System.out.println("Character value is :"+n.c);
		System.out.println("Dog value is :"+n.dg);
		System.out.println("main methos ended");

	}

}
