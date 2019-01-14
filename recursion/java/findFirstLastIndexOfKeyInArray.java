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
		int key = sc.nextInt();
		System.out.println("First Index of " + key + " is " + findFirstIndex(arr, key, 0));
		System.out.print("Last Index of " + key + " is " + findLastIndex(arr, key, 0));
	}
	
	private static int findFirstIndex(int arr[], int key, int si) {
	    if(si== arr.length) {
	        return -1;
	    } else if (arr[si] == key) {
	        return si;
	    }
	    return findFirstIndex(arr, key, si+1);    
	}
	
	private static int findLastIndex(int arr[], int key, int si) {
	    if(si== arr.length) {
	        return -1;
	    } 
	    int pos = -1;
	    if (arr[si] == key) {
	        pos = si;
	    }
	    int temp = findLastIndex(arr, key, si+1);
	    return max(pos, temp);   
	}
	
	private static int max (int a, int b) {
	    return a > b ? a : b;
	}
}