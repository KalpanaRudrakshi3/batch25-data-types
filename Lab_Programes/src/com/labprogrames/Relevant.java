package com.labprogrames;

public class Relevant {

	String stud_Name;
	int age;
	int adm_year;
	int roll_no;
	long mob_no;
	int att_percentage;
	static int total_fee=656566;
	char grade;
	String pass_fail;
	long stud_id;
	String fee_paid;

	static void disp() {
		total_fee=656566;

		System.out.println("total_fee:" + total_fee);

	}

	void display() {

		System.out.println(" stud_Name:" + stud_Name);
		System.out.println("age:" + age);
		System.out.println("adm_year:" + adm_year);
		System.out.println(" roll_no:" + roll_no);
		System.out.println("mob_no:" + mob_no);
		System.out.println("att_percentage:" + att_percentage);
		System.out.println("grade:" + grade);
		System.out.println("pass_fail:" + pass_fail);
		System.out.println("stud_id:" + stud_id);
		System.out.println("fee_paid:" + fee_paid);
	}

	public static void main(String[] args) {
		 Relevant r=new Relevant();
		 r.stud_Name="kalpana";
		 r.age=23;
		 r.adm_year=2024;
		 r.roll_no=64;
		 r.mob_no=123456778l;
		 r.att_percentage=99;
		
		r.grade='a';
		r.pass_fail="pass";
		r.stud_id=675465475654l;
		r.fee_paid="yes";
		r.display();
		r.disp();
		

	}

}
