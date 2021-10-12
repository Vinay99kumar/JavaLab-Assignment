package com.neosoft;

public class Helloworld {
	int x=100;
	public void show() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		Helloworld a=new  Helloworld();
		System.out.println("Hello world"+a.x);
		a.show();
		
	}

}
