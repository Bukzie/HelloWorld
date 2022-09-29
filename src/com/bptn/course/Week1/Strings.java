package com.bptn.course.Week1;

public class Strings {

	public static void main(String[] args) {
		
		/*
		 * Primitive Variables (starts with lower case) 
		 * 		- int, long, float, double, boolean, long, short etc
		 * 
		 * Class Variable
		 * 		- Sting = null
		 */
		
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3 = null;
		
		if (s1 == s2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Different");
		}
		
		String s4 = "Hello";
		String s5 = "BPTN";
	}

}
