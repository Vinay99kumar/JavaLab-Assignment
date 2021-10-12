package com.neosoft;

public class Methodtest {
	String getMessage(String name,int age) {
		return "welcome "+name+" your age: "+age;
	}
	int[] total(int a,int b) {
		int [] intarray=new int[2];
		intarray[0]=a+b;
		intarray[1]=a-b;
		return intarray;
	}

	public static void main(String[] args) {
		Methodtest object=new Methodtest();
		System.out.println(object.getMessage("Rohan",23));
		String msg=object.getMessage("Rohan",24);
		System.out.println(msg);
		
		
		int[] result=object.total(100, 100);
		System.out.println("Addition="+result[0]);
		System.out.println("Subtraction="+result[1]);
	

	}

}
