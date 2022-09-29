package com.bptn.course.Week1;

import java.util.Scanner;

public class WeekOneProject3 {
	

		public static void main(String[] args) {
	 

	    System.out.println("Input your inches to be converted to meters: ");
	    Scanner scan = new Scanner (System.in); 
	    double inches = scan.nextDouble();
	    double meters = inches * 0.0254;
	    System.out.println(inches + " inches equals to " + meters + "meters" );
	}

}
