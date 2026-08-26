package com.labprogrames;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DontTakePrimitive {
	BigInteger b;
	BigInteger b1= new BigInteger("425355364652754827458754876835483254857475") ;
	BigInteger b2= new BigInteger("425355364652754827458754876835483254857475") ;
	BigDecimal d1= new BigDecimal("56432654655.546527457257254675245264675246757654526426"); 
	Integer studentid=100;
	String studentName="kalpana";
	String branchName="mca";
	String collegeName="aitam";
	
	
	public static void main(String[] args) {
		
	System.out.println("main method started");
	DontTakePrimitive e1=new DontTakePrimitive();
	System.out.println(e1.b);
	System.out.println(e1.b1);
	System.out.println(e1.b2);
	System.out.println(e1.d1);
	System.out.println(e1.studentid);
	System.out.println(e1.studentName);
	System.out.println(e1.branchName);
	System.out.println(e1.collegeName);
	

	

	


	
	
	
	
	
	
	
	
	
	
	
	
	}

}
