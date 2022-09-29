package com.bptn.course.Week1;

public class ReversedNumbers {

	public static void main(String[] args) {
		
		int num = 1234, reversed = 0;
	    
	    System.out.println("Original Number: " + num);

	    // run loop until num becomes 0
	    while(num != 0) {
	    
	      // get last digit from num
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;

	      // remove the last digit from num
	      num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	}

}
	
		/*
		 * number = 1234
     * remainder = 1234 % 10 = 4
     * reverse = 0 * 10 + 4 = 0 + 4 = 4
     * number = 1234 / 10 = 123
		 
		
		int num = 1234; // Decimal System
		int reverse = 0;
		int remainder = 0;
		
		while ( num!=0 ) {
			
			remainder = num % 10; // Grab the last digit of the number
			reverse = (reverse * 10) + remainder; // Append the last digit to the reverse number
      num = num / 10; // Remove the last digit of the number
		}
		
		System.out.println("The reversed number is: " + reverse);
	}
}
		/*
		 * number = 1234
     * remainder = 1234 % 10 = 4
     * reverse = 0 * 10 + 4 = 0 + 4 = 4
     * number = 1234 / 10 = 123
		 */
		
/*
 		int num = 1234; 
 		// Decimal System
 		 
		String reverse = "";
		int remainder = 0;
		
		while ( num>0 ) {
			
			remainder = num % 10; 
			// Grab the last digit of the number
			
			reverse = reverse + remainder; 
			// Append the last digit to the reverse number as a String
			
			num = num / 10; 
			// Remove the last digit of the number
		}
		
		System.out.println("The reversed number is: " + reverse);
	}
}
*/