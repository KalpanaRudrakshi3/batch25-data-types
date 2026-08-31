package com.labprogrames;
//no return type & no parameters
public class Student27 {

	public static void main(String[] args) {
		
		System.out.println("main  method started");
		Student27 s1=new Student27();
		s1.read();
		s1.getStudentName();
		s1.write();
		s1.listen();
		
		System.out.println("main methodn ended");
		

	}
	//instance method
	void read() {
		System.out.println("read method called");
			
	}
	
	void getStudentName() {
		
		System.out.println("student name is kalpana");
	}
	
	void write() {
		
		System.out.println("write method called"); 
	}
	
	
	void listen() {
		System.out.println("listen method called");
		
		
	}

}
