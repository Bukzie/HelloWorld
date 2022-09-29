package com.bptn.course.Week2;

public class LinearSearch {

	/*
	 public static void main(String[] args) {
	 
		int key = 15, ind = -1;
		
		int[] a = {3,8,4,2,12,6};
		
		for (int i = 0; i < a.length; i++) {
			
			if (key == a[i] ) {
				
				ind = i;
				
				break;  //breaks out from the loop
			}
		}
		System.out.println("Index: " + ind); 
	}
		*/
	
	/*
public static void main(String[] args) {
		
		// Search #1
		int key = 15;
    int ind = 0;	
		int[] a = { 3, 8, 4, 2, 12, 6 };
		//     0 1 2 3  4 5		
		ind = search(a,key);
		System.out.println("Index :" + ind);
		
		// Search #2
		key = 8;
		int[] b = { 5, 4, 1, 13, 8, 9 };
		//     0 1 2 3  4 5	
		
		ind = search(b,key);
		System.out.println("Index :" + ind);
		
	}
	
	// Two parameters    array ,  key
	public static int search(int[] a, int key) {
	//
		int ind = -1;
		
		for (int i =0; i < a.length; i++ ) {
			
			if ( key == a[i] ) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		
		return ind;
	}
}
*/

/*	public static void main(String[] args) {
		int key = 2;
		int ind = -1;
		
		int[] a = { 3, 8, 4, 2, 12, 6 };
		
		
		for (int i =0; i < a.length; i++ ) {
			
			if ( key == a[i] ) {
				ind = i;
				break; // breaks out from the for loop
			}
		}
		
		System.out.println("Index :" + ind);
				
	}
*/

    public static boolean isExist(int[] arr, int n) {
        // Fill in the code for this function based on the problem statement
		for (int i =0; i < arr.length; i++ ) {
			if ( n == arr[i] ) {
			    return true;
            }
        }
        return false;
    } 
    // Do not modify the code below
    // It is used for the testing purpose
    public static void main(String[] args) {
       int[] arr = {3, 4, 1, -2, 4, 8, 10, 100, 11};
       int n = 8;
       System.out.println(isExist(arr, n));
    }

}
