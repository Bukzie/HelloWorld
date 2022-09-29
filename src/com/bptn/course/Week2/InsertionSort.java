package com.bptn.course.Week2;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] a = { 8, 4, 5, 9, 11, 2, 7 };

		for ( int j = 1; j < a.length; j++ ){
			
			int temp = a[j]; //4, value of the first element in the unsorted part of the array
			int possibleIndex = j; //index of the first element in the unsorted part of the array
			
			
			
			
			while ( possibleIndex > 0 && temp < a[possibleIndex - 1]) {
				
				a[possibleIndex] = a[possibleIndex - 1];
				possibleIndex--;
			}
			a[possibleIndex] = temp;
		}
		
		System.out.println(Arrays.toString(a));	
		// i, j, k
	}

}
