package com.If_else_Statements;
import java.util.Scanner;

public class TestDemo10 {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter oxygen range");
		int oxygen=sc.nextInt();
		
		System.out.println("enter food range ");
		int food=sc.nextInt();
		
		System.out.println("enter power range");
		int power=sc.nextInt();
		
		
if(oxygen >= 60 && food >= 40 && power == 1)
{
	System.out.println("Space Station is Safe");
}
else if(oxygen >= 60 && food >= 40 && power == 0)
		{
	System.out.println("Emergency! Power failure detected");
		}

else if(oxygen >= 40 && food >= 30 && power == 1)
{
	
	System.out.println("Critical! Oxygen and food are very low");
}
else {
	
	System.out.println("Space Station Survival Failed");
}
System.out.println("main method ended");
	}

}
