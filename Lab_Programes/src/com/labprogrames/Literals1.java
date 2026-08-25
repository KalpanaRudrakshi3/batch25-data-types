package com.labprogrames;

public class Literals1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a1=123;
		int a3=1230;
		int a4=00;//0
	//	Octal literals : any number starts with zero will consider as octal
	//	octal  number base is 8 i.e==0 to 7
		// 0 1*8^2+ 2*8^1 + 3*8^0= 64+16+3 =83
		//0456= 0 4*8^2+5*8^1+6*8^0= 4*64+5*8+6*1=
		//0676=0 6*8^2+7*8^1+6*8^0= 6*64+7*8+6
		
		//0786== invalid out of  base range(0 to 7)The literal 0786 of type int is out of range
		int a2=0123;//83
		int a5 =0456;
		int a6= 0676;
		//int a7=0786;//The literal 0786 of type int is out of range
		//**Hexa-Decimal Literals: any number starts with 0X or 0x will consider as Hexa-Decimal
		//Hexa -decimal range is  16 from ==0 to 9 & a-f/A-F
		int a7=0x123;
		int a8=0xabc;
		int a9=0xaab123;
		int a10=0x1234;
		
		
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		System.out.println(a6);
	System.out.println(a7);
	System.out.println(a8);
	System.out.println(a9);
	System.out.println(a10);
		
		System.out.println(" main method emded");

	}

}
