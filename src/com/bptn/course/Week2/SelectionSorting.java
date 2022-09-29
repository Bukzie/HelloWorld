package com.bptn.course.Week2;

import java.util.Arrays;

public class SelectionSorting {

	public static void main(String[] args) {

	 /*
	        //Sorting Algorithm
        //Selection Sort Algorithm
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        
        for(int i = 0; i < arr.length - 1; i++){
        	
            int index = i;
            
            for(int j = i + 1; j < arr.length; j++){
            	
                if(arr[j] < arr[index])
                	
                {
                    index = j; // lowest index
                }
                
            }
            
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            
        }
        
        for(int k = 0; k < arr.length; k++){
        	
            System.out.print(arr[k] + " ");
            
        }
        
     */

     /*
		
        int[] arr = {5, 1, 12, -5, 16, 2, 12, 14};
        
        // init smallestNumberIndex of the smallest element as the index of first element in the array
        // 5 & 1 => 1 is smallest. update smallestNumberIndex = 1 (index of 1)
        // 1 & 12 => no change
        // 1 & -5 => -5 is smallest. update smallestNumberIndex = 3
        // -5 & 16 => no change
        // -5 & 2 => no change
        // -5 & 12 => no change
        // -5 & 14 => no change
        //i=0
        //[5, 1, 12, -5, 16, 2, 12, 14] unsorted
        //index => 3
        //I will get the value of smallest number
        //I will update i value to smallest number
        //smallest number pointer => 5 and the index is 0
        //update smallest number pointer to => 1 and the index is 1
        //update smallest number pointer to => -5 and the index is 3
        //i=1
       // [-5, 1, 12, 5, 16, 2, 12, 14]
        //smallest number pointer (value) => 1 and the index is 1
        //i=2
       // [-5, 1, 12, 5, 16, 2, 12, 14]
        //smallest number pointer (value) => 12 and index is 2
        //update smallest number pointer => 5 and the index is 3
        //update smallest number pointer => 2 and the index is 5
         
        for(int i = 0; i < arr.length - 1; i++){
        
            int index = i;
            
            for(int j = i + 1; j < arr.length; j++){
            
                if(arr[j] < arr[index]) {
                
                    index = j; // lowest index
                }
                
            }
            
            // [5, 1, 12, -5, 16, 2, 12, 14] unsorted
            //smallest number = -5
            //index = 3
            //smallerNumber = -5
             
            int smallerNumber = arr[index];
            
            arr[index] = arr[i];
            
            arr[i] = smallerNumber;
        }
        
        	for(int k = 0; k < arr.length; k++){
        	
            System.out.print(arr[k] + " ");
            
        }
       */
        
			int[] a = {8, 4, 5, 9, 11, 2, 7};
		
			//first for loop
			for (int j = 0; j < a.length - 1; j++) {
			
				int minIndex = j;
				// store value of the minimum value temporarily
				
			//second for loop
			for (int k = j + 1; k < a.length; k++) {
				
				if ( a[k] < a[minIndex] ) {
					
					minIndex = k; //if the value at index K is smaller than the value at minIndex
				}
				
			}
			
			//time to swap values
			
			int temp = a[j];
			
			a[j] = a[minIndex];
			
			a[minIndex] = temp;
		}
			
			System.out.println(Arrays.toString(a));
			//Arrays					
				
    }
}