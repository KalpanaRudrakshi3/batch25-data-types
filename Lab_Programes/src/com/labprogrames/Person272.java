package com.labprogrames;
//no return type & with parameters
public class Person272 {
	
//instance method
	
	void main(String[] args) {
		System.out.println("main started");
		
		// method called by value
		
		getPersonName("kalpana");//arguments
		getAge(21);
		 getHeight(6.5f);
		 getPhoneNo(56756778675675l);
		System.out.println("main ended");


	}
	void getPersonName(String Name)//parameters
	{
		System.out.println("name of the person:"+Name);
	}
	
void getAge(int age ) {
	System.out.println("person age:"+age);
	
	}
void getHeight(float height) {
	
	System.out.println("person height:"+ height);
}
	void getPhoneNo(long No) {
		
		System.out.println("person No:"+No);
	}
	
	
}
