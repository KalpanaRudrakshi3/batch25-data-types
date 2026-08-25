package com.labprogrames;

//24/8/26
public class TestDemo4 {

	public static void main(String[] args) {
		System.out.println("main method started");

//here == operator checks the values if the data is Primitive.
//but, if the data is object data type it checks the address of the object

		// Wrapper cachig:
//if the data is between -128 to 127 then it allocates same memory so we will get true
		Integer i3 = 100;
		Integer i4 = 100;
		System.out.println(i3 == i4);

//But, if we check more than 127 values are allocating different memory for every new value so we will get false		
		Integer i5 = 200;
		Integer i6 = 200;
		System.out.println(i5 == i6);

		Integer i1 = 10;
		// ******Integer i1=Integer.valueOf(10);
		System.out.println(i1);
// converting primitive values to wrapper object data will consider AS auto-Boxing

		int i2 = i1;
		// ******int i2=i1.intValue();
		System.out.println(i2);
// converting  wrapper object data to  primitive will consider AS auto-unBoxing

		System.out.println("main method ended");

	}

}
