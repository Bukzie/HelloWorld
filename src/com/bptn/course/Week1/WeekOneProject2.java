package com.bptn.course.Week1;

import java.util.Scanner;
import java.lang.Math;

public class WeekOneProject2 {

	public static void main(String[] args) {

	    Scanner scan = new Scanner (System.in); 
	    
	    String cont = "y";

	    while (cont.toLowerCase().equals("y")){
	    System.out.println("Press 1 for Palindrome Check");
	    System.out.println("Press 2 to reverse a String");
	    System.out.println("Press 3 to Concatenate two Strings");
	    System.out.println("Press 4 for String Comparison");
	    System.out.println("Press 5 to Calculate the Length of String");
         System.out.println("Enter the option: ");

	   switch (scan.nextInt()) {
	       case 1: 
               System.out.println("Palindrome Check");
	           System.out.println("Enter a string: ");
	           String A = scan.next();
	           if (A.equals (new StringBuilder(A).reverse().toString())) {
                   System.out.println( A + " is a palindrome");
               } else {
                    System.out.println( A + " is not a palindrome");
               }
	           break;
	           
	        case 2: 
               System.out.println("Reverse a String");
	           System.out.println("Enter a string: ");
	            A = scan.next();
	           System.out.println("The reverse of " + A + " is " + new StringBuilder(A).reverse().toString());
	           break;
	           
	        case 3: 
               System.out.println("Concatenate two Strings");
	           System.out.println("Enter the first string: ");
	            A = scan.next();
	           System.out.println("Enter the second string: ");
	            String B = scan.next();
	           System.out.println("Both strings concatenated is " + A + B );
	           break;
	           
	        case 4: 
                System.out.println("String Comparison");
	            System.out.println("Enter the first string: ");
	            A = scan.next();
	           System.out.println("Enter the second string: ");
	            B = scan.next();
	            if (A.equals(B)) {
	            	System.out.println("The entered strings are equal");
	            } else {
	            	System.out.println("The entered strings are different");
	            }
	           break;
	           
	        case 5: 
               System.out.println("Length of String");
	           System.out.println("Enter a string: ");
	            A = scan.next();
	           System.out.println("The length of the entered string is: " + A.length());
	           break;
	           
	       default:
	    	   
	           break;
	   }
	   			System.out.println("To continue Press Y/y else Press any button to exit");
	   			cont = scan.next();
	    }
	}

	}