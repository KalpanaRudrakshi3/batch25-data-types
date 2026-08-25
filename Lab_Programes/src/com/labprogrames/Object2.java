package com.labprogrames;

import java.math.BigInteger;

import java.math.BigDecimal;

public class Object2 {
	
	public static void main (String[] args) {
		BigInteger b1=new BigInteger("100000000000000");
		BigInteger b2= new BigInteger("2344554554545");
		BigInteger sum=b1.add(b2);
		BigInteger mul=b1.multiply(b2);
		System.out.println("sum is :"+sum);
		System.out.println("multiplication is:"+mul);
		
		BigDecimal d1=new BigDecimal("100000000000000");
		BigDecimal d2= new BigDecimal("2344554554545");
		BigDecimal dsum=d1.add(d2);
		BigDecimal dmul=d1.multiply(d2);
		System.out.println("sum is :"+sum);
		System.out.println("multiplication is:"+mul);
		
	}
	

}
