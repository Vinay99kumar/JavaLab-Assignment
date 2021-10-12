package com.neosoft;

public class Polytest {

	public static void main(String[] args) {
		Calculate cal=new Calculate();
		cal.sum(10, 20);
		cal.sum(10.2f, 20.3f);
		Polytest.main('t');
		Sample sam=new Sample(10.20,20.30);
		System.out.println(sam);
		

	}
	
	public static void main(char args) {
		System.out.println("Overloading main class"+args);
	}

}

class Calculate{
	void sum(int a ,int b) {
		System.out.println("sum"+(a+b));
	}
	void sum(int a ,int b,int c) {
		System.out.println("sum"+(a+b+c));
	}
	void sum(float a ,float b) {
		System.out.println("sum"+(a+b));
	}
	void sum(float a ,float b,float c) {
		System.out.println("sum"+(a+b+c));
	}
}

class Sample{
	private double a,b;

	public Sample(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public String toString() {
		return "A"+a+"B"+b;
	}
	
}
