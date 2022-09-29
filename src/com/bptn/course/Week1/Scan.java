package com.bptn.course.Week1;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in); 
		// Creates a Scanner object so we can read info from the keyboard.
		
		System.out.println("Enter your age: ");
		
		int age = scan.nextInt(); 
		// Reads the integer value 
		
		Scanner scan2 = new Scanner (System.in); 
		// Creates a Scanner object so we can read info from the keyboard.
		
		System.out.println("Enter Username: ");
		
		String username = scan2.nextLine();
		// Reads the string input from the console
		
		System.out.println("Hello, " + age + "years old " + username + "!");
		//Display the 2 info
		
		//UNICODE
		
				int i = (int)'C';
				
				char c = 'A'; //65
				int a = c;
				
				System.out.println(a);
	}

}
