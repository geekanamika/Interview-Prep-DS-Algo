/*
Missing number in array
                    
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int getMissingNum(int arr[]) {
        long sum = 0;
        int n = arr.length;
        long sumTotal = (n * (n+1))/2;
        for(int i=0; i<n; i++) {
            sum += arr[i];
        }
        return (int) (sumTotal-sum);
    }
    
	public static void main (String[] args) {
		int t, n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t>0) {
		    t--;
		    n = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n-1; i++)
		        arr[i] = sc.nextInt();
		        
		    System.out.println(getMissingNum(arr));
		    
		}
	}
}