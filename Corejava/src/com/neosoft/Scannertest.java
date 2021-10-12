package com.neosoft;
import java.util.Scanner;

public class Scannertest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ur name");
		String name=s.nextLine();
		System.out.println("hii"+name);
		System.out.println("enter ur age");
		int age=s.nextInt();
		System.out.println(age);
		String txt=s.nextLine();
		int ag=Integer.parseInt(txt);
		System.out.println(ag);
		s.close();

	}

}
