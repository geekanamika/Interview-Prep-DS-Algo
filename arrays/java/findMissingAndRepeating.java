/*
Find Missing And Repeating
          
Given an unsorted array of size N of positive integers. One number 'A' from set {1, 2, …N} is missing and one number 'B' occurs twice in array. Find these two numbers.

Note: If you find multiple answers then print the Smallest number found. Also, expected solution is O(n) time and constant extra space.

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print B, the repeating number followed by A which is missing in a single line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 ≤ A[i] ≤ N

Example:
Input:
2
2
2 2
3 
1 3 3

Output:
2 1
3 2


*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void findMR(int arr[]) {
        int n = arr.length;
        long diff = 0;
        long sqDiff = 0;
        for(int i=0, j=1; i<n; i++, j++) {
            diff += (arr[i]-j);
            sqDiff += ((arr[i]*arr[i]) - (j*j));
        }
        long add =0;
        if (diff!=0)
            add =  sqDiff/diff;  
        
        System.out.println( ((diff+add)/2) + " " + ((add-diff)/2));
    }
    
	public static void main (String[] args) {
		int t;
		int n,i;
	    Scanner sc = new Scanner(System.in);
	    t = sc.nextInt();
	    while(t-- >0) {
	        n = sc.nextInt();
	        int arr[] = new int[n];
	        for(i=0; i<n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        findMR(arr);
	    }
	}
}