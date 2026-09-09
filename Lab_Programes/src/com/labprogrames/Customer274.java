package com.labprogrames;

import java.util.Scanner;

public class Customer274 {

	public static void main(String[] args) {
		 
		System.out.println("main statred");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter id:");
        int id=sc.nextInt();
        getCustomerId(id);
        
        System.out.println("enter name:");
        String name=sc.next();
        getCustomerName(name);
        System.out.println("phone no:");
        long phone=sc.nextLong();
        getCustomerPhone(phone);
        
        System.out.println("Customer city");
        String city=sc.next();
        getCustomerCity(city);
        
        System.out.println("Customer pan");
        String pan=sc.next();
        getCustomerPan(pan);
        
	System.out.println("main ended");
	
	
}

 static void getCustomerName(String name) {
	 System.out.println("customer name:"+ name);

}

 static void getCustomerPhone(long phone) {
System.out.println("Customer no:"+phone);
}

 static void getCustomerId(int id) {
	 System.out.println("Customer ID is:"+id);

}

 static void getCustomerCity(String city) {
	 System.out.println("Customer city is:"+city);

}

 static void getCustomerPan(String pan) {
	 System.out.println("Customer pan is:"+pan);

}


	}


