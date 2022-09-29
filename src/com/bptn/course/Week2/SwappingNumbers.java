package com.bptn.course.Week2;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
	    
		int x, y, temp;

	    Scanner scan = new Scanner (System.in); 
	System.out.println("Enter the value of X and Y");

	   // x = scan.nextInt(); 
	    x= Integer.valueOf( scan.nextLine() );
	    y= Integer.valueOf( scan.nextLine() );
	   // y = scan.nextInt();
	    
	System.out.println("before swapping numbers: "+x +" "+ y);  

	    temp = x;
	    x = y;
	    y = temp;

	System.out.println("After swapping: "+x +" " + y); 

	}

}
