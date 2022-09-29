package com.bptn.course.Week2;

import java.util.Scanner;

class Month {
	
	//Converts the month number into the month name.
	String printMonth (int month) {
		
		String str = "";
		
		switch (month) {
	    case 0:
            str = "January";
            break;
        
	    case 1:
            str = "Febuary";
            break;
        
	    case 2:
            str = "March";
            break;
        
	    case 3:
            str = "April";
            break;
        
	    case 4:
            str =  "May";
            break;
        
	    case 5:
            str = "June";
            break;
        
	    case 6:
            str =  "July";
            break;
        
	    case 7:
            str = "August";
            break;
        
	    case 8:
            str = "September";
            break;
        
	    case 9:
            str = "October";
            break;
        
	    case 10:
            str = "November";
            break;
        
	    case 11:
            str = "December";
            break;
        
        default:
        	str = "Invalid month";
		    break;
        
		}
		
		return str;
	}
}

public class MonthDetection {

	public static void main(String[] args) {
		
		Month obj = new Month();
		//Create an object of class Month
		
		Scanner scan = new Scanner(System.in);
		//Create a scanner
		
		System.out.println("Please enter a month number between 1 - 12: ");
		int month = scan.nextInt();
		//Grab user input
		
		String str = obj.printMonth(month);
		//Converts the month number (user input) into the month name
		//We call the printMonth() method of the Month object
		
		
		System.out.println("The month is: " + str);
		//Print out the month name.
		
			
	}

}
