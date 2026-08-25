package com.labprogrames;
import java.math.BigInteger;
import java.math.BigDecimal;

public class Objectype {

	BigInteger b = new BigInteger("567576567567575675677566756665645664");
	BigInteger b2 = new BigInteger("567576567567575675677566756665645664");
	BigDecimal b1 = new BigDecimal("656565665675567687645658678778899898");
	BigDecimal b4 = new BigDecimal("656565665675567687645658678778899898");

	public static void main(String[] args) {
		System.out.println("main method started");
		Objectype j = new Objectype();
		System.out.println("BigInteger value is :" + j.b);
		System.out.println("BigInteger value is :" + j.b2);
		System.out.println("BigDecimal value is :" + j.b1);
		System.out.println("BigDecimal value is :" + j.b4);
		System.out.println("main method ended");

	}

}
