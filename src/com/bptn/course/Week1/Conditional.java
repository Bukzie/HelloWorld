package com.bptn.course.Week1;

public class Conditional {

	public static void main(String[] args) {
		
		int a = 8;
		int b = 4;
		
		//NEsted Conditionals - Nested If Statements
		
		int c = 3;
		
		if ( a > b ) {
			
			if ( a < c ) {
				
				System.out.println( a + " is lesser than " + c);
				
			} else {
				
				System.out.println( a + " is bigger than " + c);
				
			}
			
		} else {
			
			System.out.println( a + " is lesser than " + b);

		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		if ( a > b ) {
//			
//			System.out.println( a + " is bigger than " + b);
//			
//		} else if ( a < b ) {
//			
//			System.out.println( a + " is lesser than " + b);
//			
//		} else if ( a < b ) {
//			
//	
//			System.out.println( a + " is lesser than " + b);
//			
//		
//		} else {
//			
//			System.out.println( a + " is equal to " + b);
//			
//		}

	}

}
