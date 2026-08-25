package com.labprogrames;
//18/8/26
//jvm will provides default values
// *for numbers it is like 0
//* for decimal point data 0.0
//for single char is ------space
// for boolean is ------false
//byte--short--int--long--(implicit)
//long--int--short--byte--(explicit)
public class Converting {
	//more than 127 is not possible 
	//CE:type mismatch:cannot convert from int ti byte
	//by default RHS numeric values are int values
	
	byte b=127;
	//-128,-127,-126.......0,1,2,3,4..............127
	byte b1=(byte)130;//int to byte convertion--(explicit type casting)
	byte b2=(byte)128;
	byte b3=(byte)256;
	//short means 2 bytes-->16 bits= (2^15) -32768 to 32767
	short s=32767;
	//short s1=40000;//Type mismatch: cannot convert from int to short
	short s2=(short)40000;//(explicit type casting)
	//int means 4 bytes --> 32 bits =(2^31)= -2147483648 to 2147483647
	int i=2147483647;
	//int i1=2147483648;//The literal 2147483648 of type int is out of range
	//long means 8 bytes --- 64 bits (2^63)=
	long l=9223372036854775807L;
	//long l=9223372036854775808L;--The literal 9223372036854775808L of type long is out of range
	long phno=7854965569L;
	long l1= i;//int to long conversion -- is called as implicit type casting
	int phno1=(int)phno;
	//float is for decimal point data representation
	//by defauit RHS decimal point is double
	float f=5.9f;//type mismatch: cannot convert from double to float
	double d=75.5;
	float f1=7576.879996857654564545454f;
	double d1=7576.876756857654564545454;
	float f2=7576.123456789f;
	double d2=7576.123456789;
	float f3=9234567898765432345678766f;
	double d3=9234567898765432345678766.5;;
	//char means 2 bytes =-32768+32767=65535
	//char range is 0 to 65535
	char c='A';//single quote characters
	char c1=65;// ASCII value 65 to 90-->A to Z
	char c2=97;//ASCII value 91 to 96-- special characters and 97 to 122-->a to z
	char c3=77;
	char c4=5464;//int to char-- implicit
	int i3='a';// char to int-- implicit
	char c5='\u0040';//unicode or hex
	char c6='\u0022';//unicode or hex
	boolean boo;
	boolean boo1=true;
	//boolean boo2=0;(Type mismatch: cannot convert from int to boolean)
	//boolean boo3=2;(Type mismatch: cannot convert from int to boolean)
	//boolean boo4=TRUE;(TRUE cannot be resolved to a variable)
	//boolean boo6=FALSE;(Syntax error on token ";", AnnotationName expected after this token)
	//boolean boo5=True;(True cannot be resolved to a variable)
	//boolean boo7=False;(False cannot be resolved to a variable)
	//boolean boo8="true";(Type mismatch: cannot convert from String to boolean)
	//boolean boo9="false";(Type mismatch: cannot convert from String to boolean)
	
	
	public static void main(String[] args) {
		System.out.println("main method started");
		Converting d = new Converting();
		System.out.println(Math.pow(4, 2));//method
		System.out.println((int)Math.pow(4, 2));

		System.out.println("byte:" + d.b);
		System.out.println("byte:" + d.b1);
		System.out.println("byte:" + d.b2);
		System.out.println("byte:" + d.b3);
		System.out.println("short:" + d.s);
		System.out.println("short:" + d.s2);
		System.out.println("int:" + d.i);
		System.out.println("long:" + d.l);
		System.out.println("long:" + d.phno);
		System.out.println("long:" + d.phno1);
		System.out.println("long:" + d.l1);
		System.out.println("float:" + d.f);
		System.out.println("double:" + d.d);
		System.out.println("float:" + d.f1);
		System.out.println("double:" + d.d1);
		System.out.println("float:" + d.f2);
		System.out.println("double:" + d.d2);
		System.out.println("float:" + d.f3);
		System.out.println("double:" + d.d3);
		System.out.println("char:" + d.c);
		System.out.println("char:" + d.c1);
		System.out.println("char:" + d.c2);
		System.out.println("char:" + d.c3);
		System.out.println("char:" + d.c4);
		System.out.println("int:" + d.i3);
		System.out.println("char:" + d.c5);
		System.out.println("char:" + d.c6);
		System.out.println("boolean:" + d.boo);
		System.out.println("boolean:" + d.boo1);
		if(d.boo1) {
			System.out.println("good morninh have a nice day");
		}
		System.out.println("main method ended");


		
		
		
		
		
		
		
		
	}

}
