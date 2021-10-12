package com.neosoft;

public class Trainee {

	String name;
	String qualification;
	int age;
	String city;
	String email;
	
	
	public Trainee(String name1,String city1,int i,String qualification1,String email1){
		this.name=name1;
		this.city=city1;
		this.age=i;
		this.qualification=qualification1;
		this.email=email1;
	}
	
	public Trainee(){
		name="Unknown";
		qualification="Unknown";
		age=0;
		city="Unknown";
		email="Unkwon";
		
	}
	
	public void show() {
		System.out.println("Name:  "+name+" qualification:  "+qualification+"Age:  "+age+"City:  "+city+"EmaIL:  "+email);
	}
	
	
	

}
