package com.neosoft;

public class Trainedetail {

	public static void main(String[] args) {
		Trainee a1=new Trainee();
		Trainee a2=new Trainee();
		Trainee a3=new Trainee("rohan","noida",24,"Btect","rohan@");
		Trainee a4=new Trainee();
		a1.name="Vinay";
		a1.city="noida";
		a1.age=23;
		a1.qualification="B.tech";
		a1.email="vinay@mail.com0";
	
		a1.show();
		
		a2.name="Abhishek";
		a2.city="noida";
		a2.age=26;
		a2.qualification="B.tech";
		a2.email="abhishek@neosoft mail .com";
		
		a2.show();
		a3.show();
		a4.show();
		
		
			
		

	}

}
