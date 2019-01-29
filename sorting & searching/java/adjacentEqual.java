/*
Adjacent Equal Submissions: 237   Accuracy: 68.78%   Max. Score: 100

Given an array A of N integers. The task is to count the pairs which are adjacent and equal.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines of input, first of which contains N(size of array) and next line contains N elements.

Output:
For each testcase, print the count of such pairs which are adjacent and equal.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= A[i] <= 106

Example:
Input:
1
5
5 2 2 1 3

Output:
1

Explanation:
Testcase 1: 2 and 2 forms a pair which are adjacent and equal.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void checkAdjEqual(int arr[]) {
        int i =0;
        int count = 0;
        for(i=0; i<(arr.length-1); i++) {
            if(arr[i] == arr[i+1]) {
                count++;
            }
        }
        System.out.println(count);
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
	        
	        checkAdjEqual(arr);
	    }
	}
}