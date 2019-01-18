/*
Print Pattern Submissions: 7041   Accuracy: 59.7%   Difficulty: Easy   Marks: 2
Associated Course(s):   Interview Preparation   Geeks Classes in Noida More
         
Print a sequence of numbers starting with N, without using loop, in which  A[i+1] = A[i] - 5,  if  A[i]>0, else A[i+1]=A[i] + 5  repeat it until A[i]=N.

Input:
The first line contains an integer T, number of test cases. Then following T lines contains an integer N.

Output:
For each test case, print the pattern in newline with space separated integers.

Constraints:
0< N < 10000

Example:
Input:
2
16
10
Output: 
16 11 6 1 -4 1 6 11 16
10 5 0 5 10

Explanation:
We basically first reduce 5 one by one until we reach a negative or 0. After we reach 0 or negative, we one by one add 5 until we reach N.
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n,t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while(t>0) {
            t--;
            n = sc.nextInt();
            printPattern(n, n, true);
            System.out.println();
        }
        
	}
	
	private static void printPattern(int n, int k, boolean flag) {
	    
	    System.out.print(n + " ");
	    if (n==k && flag == false) {
	        return;
	    }
	    if (n>0 && flag == true) {
	        printPattern(n-5, k, true);
	    } else if (n<=0 || flag == false) {
	        printPattern(n+5, k, false);
	    }
	}
}