package com.If_else_Statements;
import java.util.Scanner;
public class TestDemo2 {
	public static void main(String[] args) {
		
	System.out.println(" main method started ");
	Scanner sc=new Scanner(System.in);
	System.out.println("enter marks");
	int marks=sc.nextInt();

if(marks>100||marks<=0) {
	System.out.println("invalid marks");
}
else if(marks>=35) {
	System.out.println("jus passed");
}
else if(marks >=60) {
	System.out.println("grade D");
}
else if(marks>=70) {
	System.out.println("grade C");
}
else if(marks>=80) {
	System.out.println("grade B");
}

else if(marks>=90) {
	System.out.println("grade A");
}

else {
	
	System.out.println("your are fail");
}

System.out.println("main method ended");
}

}




	
