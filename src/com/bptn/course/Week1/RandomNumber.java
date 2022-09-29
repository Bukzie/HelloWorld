package com.bptn.course.Week1;

public class RandomNumber {


	public static void main(String[] args) {
		
		int min = 1;  
		int max = 10;  
		
		//Generate random double value from 1 to 10   
		System.out.println("Random value of type double between " + min + " to " + max + ":");  
		
		double a = Math.random() * ( max - min + 1) + min;   
		
		System.out.println(a);  
		
		//Generate random int value from 200 to 400   
		System.out.println("Random value of type int between " + min + " to " + max + ":"); 
		
		int b = (int)(Math.random() * ( max - min + 1) + min);  
		
		//Math.float () ---> round down a value e.g 8.6 = 8
		//Math.ceil () ---> round up a value e.g 8.6 = 9
		
		
		
		System.out.println(b);  

	}

}
