/*
Floor in a Sorted Array
        
Given a sorted array arr[] without duplicates, and a value x. Find the floor of x in given array.
Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x.

Input:
First line of input contains number of testcases T. For each testcase, first line of input contains number of elements in the array and element whose floor is to be searched. Last line of input contains array elements.

Output:
Output the index of floor of x if exists, else print -1.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
1 ≤ arr[i] ≤ 1018
0 ≤ X ≤ arr[n-1]

Example:
Input:
3
7 0
1 2 8 10 11 12 19
7 5
1 2 8 10 11 12 19
7 10
1 2 8 10 11 12 19

Output:
-1
1
3

*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long getFloor(long arr[], long x) {
        int i =0;
        if (arr[i] > x)
            return -1;
        else if (arr[arr.length-1] <= x)
            return arr.length-1;
        else {
            while(i<arr.length && arr[i] <= x) {
                i++;
            }
            if (arr[i-1] == x)
                return i-1;
            else if (arr[i-1] < x && i < arr.length && arr[i] > x)
                return i-1;
        }
        return i-1;
    }
    
	public static void main (String[] args) {
		int t, n;
		long x;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t>0) {
		    t--;
		    n = sc.nextInt();
		    x = sc.nextLong();
		    long arr[] = new long[n];
		    
		    for(int i=0; i<n; i++)
		        arr[i] = sc.nextLong();
		        
		    System.out.println(getFloor(arr, x));
		    
		}
	}
}