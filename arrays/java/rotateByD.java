/*
Rotating an Array Submissions: 27143   Accuracy: 42.51%   Difficulty: Basic   Marks: 1
Associated Course(s):   Sudo Placement [IITs]
        
Given an array of N size. The task is to rotate array by d elements where d is less than or equal to N.

Input:
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines. The first line of each test case consists of an integer N, where N is the size of array.
The second line of each test case contains N space separated integers denoting array elements. The third line of each test case contains "d" .

Output:
Corresponding to each test case, in a new line, print the modified array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 200
1 ≤ A[i] ≤ 1000

Example:
Input
1
5
1 2 3 4 5
2

Output
3 4 5 1 2
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void rotateByD(int arr[], int n, int d) {
        for (int i=0; i<d; i++) {
            arr[n+i] = arr[i];
        }
        n = n+d;
        for(int i=d; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,d;
		while(t>0) {
		    t--;
		    n = sc.nextInt();
		    int arr[] = new int[2*n];
		    for(int i=0; i<n; i++) {
		        arr[i] = sc.nextInt();
		    }
		    d = sc.nextInt();
		    rotateByD(arr, n,d);
		}
	}
}