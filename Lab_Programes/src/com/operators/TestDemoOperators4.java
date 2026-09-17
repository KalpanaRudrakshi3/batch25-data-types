package com.operators;
//unary operator
//+ - ++ --
public class TestDemoOperators4 {

	public static void main(String[] args) {
		System.out.println("main method started");
		int a=5;
		int b=6;
		 
		System.out.println(+a);// 5unary +
		System.out.println(-b);// -6 unary - b

		System.out.println(++a);//a=a+1 ==>6
		System.out.println(--b);//b=b-1==>5
		System.out.println(a++);//6 ==> a=a+1==>7
		System.out.println(b--);//5 ==> b=b-1==>4
		System.out.println("-----------------------------");
		System.out.println(++a);//a=a+1=8
		System.out.println(b--);//4 ==>b=b-1=3
		System.out.println(a++);//8 ==>a=a+1=9
		System.out.println(b++);//3 ==>b=b+1=4
		System.out.println(++b);//b=b+1=5
		System.out.println(--a);//a=a-1=8
		System.out.println(++b);//b=b+1=6
		System.out.println(b--);//6==> b=b-1=5
		System.out.println(--a);//a=a-1=7
		System.out.println(a--);//7==>a=a-1=6
		System.out.println(b++);//5==> b=b+1=6
		System.out.println("A value :"+ a);//6
		System.out.println("B value :"+ b);//6
		
		System.out.println(++a + b++ + a-- + b-- );
		
		System.out.println("A value:"+a);
		System.out.println("B value:"+b);
		
		System.out.println(a++ + ++b +--b + a-- + b++ + ++a + b++);
		
		System.out.println(++a + b++- --a - ++b + a++ + b++ );
		 
		
		
	}
 
}
