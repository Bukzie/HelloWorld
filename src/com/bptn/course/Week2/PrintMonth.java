package com.bptn.course.Week2;

import java.util.Scanner;

public class PrintMonth {

	public static void main(String[] args) {
	    
	    Scanner scan = new Scanner (System.in);

		    System.out.println("Please enter a month number between 1 - 12: ");
		    
		    int month = scan.nextInt();

		switch (month) {
		    case 1:
	            System.out.println("The month " + month + " is January");
	        break;

	        case 2:
	            System.out.println("The month " + month + " is February");
	        break;
	    
	        case 3:
	        System.out.println("The month " + month + " is March");
	        break;

	        case 4:
	        System.out.println("The month " + month + " is April");
	        break;

	        case 5:
	        System.out.println("The month " + month + " is May");
	        break;

	        case 6:
	        System.out.println("The month " + month + " is June");
	        break;

	        case 7:
	        System.out.println("The month " + month + " is July");
	        break;

	        case 8:
	        System.out.println("The month " + month + " is August");
	        break;

	        case 9:
	        System.out.println("The month " + month + " is September");
	        break;

	        case 10:
	        System.out.println("The month " + month + " is October");
	        break;

	        case 11:
	        System.out.println("The month " + month + " is November");
	        break;

	        case 12:
	        System.out.println("The month " + month + " is December");
	        break;

	        default:
		    break;
	    }
	       
	}

}
