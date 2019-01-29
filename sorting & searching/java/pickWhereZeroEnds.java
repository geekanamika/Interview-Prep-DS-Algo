/*
Pick the one

Given a sorted binary array A of N elements. The task is to find the index from where 0 ends in the given array.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines of input first of which contains N(size of array A), and next line contains N elements consisting of 0s and 1s only.

Output:
For each testcase, print the index (0-based) where 0 ends. Print "-1" (without quotes) if 0 is not present.

Constraints:
1 <= T <= 100
1 <= N <= 106
0 <= A[i] <= 1

Example:
Input:
1
5
0 0 0 1 1

Output:
2

Explanation:
Testcase 1: In the given array, 0 ends at index 2.
*/

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void pickIndexOfEndingZero(int arr[]) {
        if(arr[0] == 1) {
            System.out.println(-1);
            return;
        }   else if (arr[arr.length-1] == 0) {
            System.out.println(arr.length-1);
            return;
        }   else {
            // zero is present atleast on first index
            int low = 0, high = arr.length-1, mid;
            int n = arr.length-1;
            while(low<=high) {
                mid = (low+high)/2;
                if (arr[mid] == 0 && mid!= n && arr[mid+1] == 1) {
                    System.out.println(mid);
                    return;
                } else if (arr[mid] == 1) {
                    high = mid-1;
                } else {
                    low = mid+1;
                }
            }
            
        }
    }
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
	        new InputStreamReader(System.in) );
	    int t= Integer.parseInt(br.readLine());
	    int n;
	    while(t>0) {
	        t--;
	        n = Integer.parseInt(br.readLine());
	        String str = br.readLine();
	        String s[] = str.trim().split("\\s+");
	        int arr[] = new int[n];
	        for(int i=0; i<n; i++) {
	            arr[i] = Integer.parseInt(s[i]);
	        }
	        
	        pickIndexOfEndingZero(arr);
	        
	    }
	}   
}