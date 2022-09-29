package com.bptn.course.Week1;

import java.util.Scanner;
import java.lang.Math;

public class WeekOneProject1 {

	public static void main(String[] args) {

	    Scanner scan = new Scanner (System.in); 
	    
	    int cont = 1;

	    while (cont == 1){
	    System.out.println("Press 1 for addition");
	    System.out.println("Press 2 for subtraction");
	    System.out.println("Press 3 for Multiplication");
	    System.out.println("Press 4 for Division");
	    System.out.println("Press 5 for finding Square");
	    System.out.println("Press 6 for finding Square root");
	    System.out.println("Press 7 for finding Reciprocal");

	   switch (scan.nextInt()) {
	       case 1: 
	           System.out.print("Enter the first number: ");
	           double A = scan.nextDouble();
	           System.out.print("Enter the second number: ");
	           double B = scan.nextDouble();
	           double C = A + B;
	           System.out.println("The sum of the numbers " + A + " and " + B + " = " + C );
	           break;
	        
	       case 2: 
	           System.out.print("Enter the first number: ");
	            A = scan.nextDouble();	           
	            System.out.print("Enter the second number: ");
	            B = scan.nextDouble();
	            C = A - B;
	            System.out.println("The subtraction of the numbers " + A + " and " + B + " = " + C );
	           break;
	           
	        case 3: 
	           System.out.print("Enter the first number: ");
	            A = scan.nextDouble();	           
	            System.out.print("Enter the second number: ");
	            B = scan.nextDouble();
	            C = A * B;
	           System.out.println("The product of the numbers " + A + " and " + B + " = " + C );
	           break;
	           
	        case 4: 
	           System.out.print("Enter the first number: ");
	            A = scan.nextDouble();
	           System.out.print("Enter the second number: ");
	            B = scan.nextDouble();
	            C = A / B;
	           System.out.println("The division of the numbers " + A + " and " + B + " = " + C );
	           break;
	           
	        case 5: 
	           System.out.print("Enter the number to find square: ");
	            A = scan.nextDouble();
	            C = A*A;
	           System.out.println("The square of the number " + A + " = " + C );
	           break;
	           
	        case 6: 
	           System.out.print("Enter the number to find square root: ");
	            A = scan.nextDouble();
	            C = Math.sqrt(A);
	           System.out.println("The square root of the number " + A + " = " + C );
	           break;
	           
	        case 7: 
	           System.out.print("Enter the number to find reciprocal: ");
	            A = scan.nextDouble();
	            C = 1.0d/A;
	           System.out.println("The reciprocal of the number " + A + " = " + C );
	           break;
	           
	       default:
	           break;
	   }
	        System.out.println("To continue calculation Press 1 else Press any button to exit");
	        cont = scan.nextInt();
	    }
	}

}

/*
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public void calculator () {

        Scanner scan = new Scanner (System.in);        
        System.out.println("Enter the first number: ");
	           double A = scan.nextDouble();
	    System.out.println("Enter the second number: ");
	           double B = scan.nextDouble();
                
                boolean unknown;

               double result = 0;
        
        do {
            unknown = false;

        System.out.println("Enter the operator (+,-,*,/): ");
	           
        switch (scan.next().charAt(0)) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            default:
            unknown = true;
            System.out.println("Incorrect operator");
            break;
        }
        } while ( unknown );
        
        System.out.println("The result is " + result);
    }

	public static void main(String[] args) {
    
            Main obj = new Main ();

            obj.calculator();

    }

}
*/
