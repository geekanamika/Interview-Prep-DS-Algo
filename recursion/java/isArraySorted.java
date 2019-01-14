/*package whatever //do not write package name here */

import java.util.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n, i=0;
		int arr[];
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		while(i<n) {
		    arr[i] = sc.nextInt();
		    i++;
		}
		System.out.print("Array is sorted: " + isArraySorted(arr, 0));
	}
	
	private static boolean isArraySorted(int arr[], int si) {
	    if(si== arr.length - 1) {
	        return true;
	    } 
	    if (arr[si] <= arr[si+1] )
	        return isArraySorted(arr, si+1);
	    else return false;     
	}
}