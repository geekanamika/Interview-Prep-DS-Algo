/*
Number of paths Submissions: 8935   Accuracy: 57.63%   Difficulty: Basic   Marks: 1
Associated Course(s):   Geeks Classes in Noida   Geeks Classes in Noida More
            
The problem is to count all the possible paths from top left to bottom right of a  MxN matrix with the constraints that from each cell you can either move to right or down.

Input:
The first line of input contains an integer T, denoting the number of test cases.
The first line of each test case is M and N, M is number of rows and N is number of columns.

Output:
For each test case, print the number of paths.

Constraints:

1 ≤ T ≤ 30
1 ≤ M,N ≤ 10

Example:
Input
2
3 3
2 8
Output
6
8
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    private static int findNoPaths(int i, int j, int m, int n) {
        if (i==m && j==n) {
            return 1;
        }
            
        int ans =0;
        if(i<m)
            ans = ans + findNoPaths(i+1, j, m, n);
        if(j<n)    
            ans = ans + findNoPaths(i, j+1, m, n);
        
        return ans;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int m, n;
		while(t>0) {
		    t--;
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(findNoPaths(1,1,m,n) );
		}
	}
}