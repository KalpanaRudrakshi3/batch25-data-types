package com.labprogrames;

public class Person2722 {

	
	
		 public static void main(String[] args) {
			System.out.println("main started");
			
			Person2722 p1=new Person2722 ();

			p1.getPersonName("kalpana");//arguments
			p1.getAge(21);
			p1. getHeight(6.5f);
			 p1.getPhoneNo(56756778675675l);
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
