package com.neosoft;

public class StringTest {

	public static void main(String[] args) {
		String str="Virat";
		str=str.concat("Kohli");//return new object
		System.out.println(str);
		
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(2));
		System.out.println(s1.equals(s3));
		
		System.out.println("===================");		
		//Performance or speed test
		System.gc();
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory = Runtime.getRuntime().freeMemory();
		
		//String str = new String();
		StringBuilder str = new StringBuilder();
		//StringBuffer str = new StringBuffer();
		for(int i=0;i<1000000;i++) 
			str.append("i:");
		
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
        System.out.println("Time taken : "+(end-start));
		System.out.println("Memory used : "+(startMemory-endMemory));

	}

}
