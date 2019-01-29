/*
Element appearing once Submissions: 2553   Accuracy: 49.63%   Difficulty: Easy   Marks: 2
        
Given an sorted array A[i] of N positive integers having all the numbers occuring exactly twice, except for one number which will occur only once. Find the number occuring only once.

Input
The first line of input contains an integer T denoting the number of test cases. Then T test cases
follow. The first line of each test case contains a positive integer N, denoting the size of the array.
The second line of each test case contains a N positive integers, denoting the elements of the
array.


Output
Print out the singly occuring number.


Constraints
1 <= T  <= 100
0 <   N  <= 100
0 <= A[i] <= 100

Examples 

Input
2
5
1 1 2 5 5
7
2 2 5 5 20 30 30


Output
2
20
 

Expected Complexity

Time : O(N)
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void checkOnce(int arr[]) {
        int freq[] = new int[101];
        for(int i=0; i<arr.length; i++) {
            freq[arr[i]]++;
        }
        for(int i=0; i<=100; i++) {
            if(freq[i] == 1) {
                System.out.println(i);
                break;
            }
                
        }
        
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n;
		while(t>0) {
		    t--;
		    n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    checkOnce(arr);
		}
	}
}