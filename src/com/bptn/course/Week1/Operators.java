package com.bptn.course.Week1;

public class Operators {

	public static void main(String[] args) {
		
		//Arithmetic Operators
		// + - * / %
		
		int a = 13;
		int b = 8;
		
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		double div = (double) a / b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
		//modulus -> mod
		
		int mod = a % b;
		System.out.println(mod);
		
		boolean b1 = a > b;		// Greater than
		boolean b2 = a < b;		// Less than
		boolean b3 = a >= b;	// Greater or Equal to
		boolean b4 = a <= b;	// Less or Equal to
		boolean b5 = a == b;	// Equal to
		boolean b6 = a != b;	// Not Equal to
				
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
		System.out.println(b6); 
		
		/*
		AND & Operantor 
		
		0 0 -> 0
		0 1 -> 0
		1 0 -> 0
		1 1 -> 1
		*/
		

		int c = a & b;
		System.out.println(c);
		
		/*
		OR | Operator
		
		0 0 -> 0
		0 1 -> 1
		1 0 -> 1
		1 1 -> 1 
		*/
		
		int d = a | b;
		System.out.println(d);
				
		/* 
		XOR ^ Operator
		
		0 0 -> 0
		0 1 -> 1
		1 0 -> 1
		1 1 -> 0 
		*/ 
		
		int e = a ^ b;
		System.out.println(e);
		
		// >> moves x number of bits to the right
		// <data tyoe> <variable> = <value> >> x
		
		int f = a >> 3;
		System.out.println(f);
		
		// << moves x number of bits to the left
		
		int g = a << 68;
		System.out.println(g);
	}

}
