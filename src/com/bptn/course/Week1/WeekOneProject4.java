package com.bptn.course.Week1;

import java.util.Scanner;

public class WeekOneProject4 {

	public static void main(String[] args) {
		 	
			Scanner scan = new Scanner (System.in); 

		    System.out.println("Input your distance in meters: ");
		    double meters = scan.nextDouble();
		    
		    System.out.println("Input your hours: ");
		    int hours = scan.nextInt();
		    
		    System.out.println("Input your minutes: ");
		    int minutes = scan.nextInt();
		    
		    System.out.println("Input your seconds: ");
		    int seconds = scan.nextInt();

		    double time = (hours * 60d * 60d) + (minutes * 60d) + seconds;
		    double hour = (time/60d)/60d;
		    double mps = meters/time;
		    double kmh = (meters/1000d)/hour;
		    double milesPerHour = (meters/1609d)/hour;

		    System.out.println("Your speed in meters/second is " + mps);
		    System.out.println("Your speed in km/h is " + kmh);
		    System.out.println("Your speed in miles/h is " + milesPerHour);
		    }
}
		
