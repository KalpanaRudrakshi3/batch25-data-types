package com.labprogrames;

public class Primitive {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	char c;
	boolean boo;

	public static void main(String[] args) {
		System.out.println("main method started");
		Primitive d = new Primitive();

		System.out.println("byte:" + d.b);
		System.out.println("short:" + d.s);
		System.out.println("int:" + d.i);
		System.out.println("long:" + d.l);
		System.out.println("float:" + d.f);
		System.out.println("double:" + d.d);
		System.out.println("char:" + d.c);
		System.out.println("boolean:" + d.boo);
		System.out.println("main method ended");

	}

}
