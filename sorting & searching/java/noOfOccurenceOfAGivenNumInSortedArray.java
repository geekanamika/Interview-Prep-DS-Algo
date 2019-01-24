/*
Number of occurrence Submissions: 12627   Accuracy: 49.87%   Difficulty: Basic   Marks: 1
Associated Course(s):   Interview Preparation   Sudo Placement [IITs]
           
Given a sorted array A of size N and a number X, you need to find the number of occurrences of X in A.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input: The first line contains N and X(element whose occurrence needs to be counted). The second line contains the elements of the array separated by spaces.

Output:
For each testcase, print the count of the occurrences of X in the array, if count is zero then print -1.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 105
1 ≤ A[i] ≤ 103
1 <= X <= 103

Example:
Input:
2
7 2
1 1 2 2 2 2 3
7 4
1 1 2 2 2 2 3
Output:
4
-1

Explanation:
Testcase 1: 2 occurs 4 times in 1 1 2 2 2 2 3
Testcase 2: 4 is not present in 1 1 2 2 2 2 3
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int firstOccurence(int arr[], int x){
        int low = 0, high  = arr.length - 1;
        int mid;
        while(low <= high && low>=0) {
            mid = (low+high)/2;
            if(arr[mid] == x) {
                if(mid >0 && arr[mid-1] == x)
                    high = mid-1;
                else
                    return mid;
            } else if (arr[mid] <x) {
                low = mid+1;
            } else 
                high = mid-1;
        }
        return -1;
    }
    
	public static void main (String[] args) {
		int t, n, x;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t>0) {
		    t--;
		    n = sc.nextInt();
		    x = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i=0; i<n; i++)
		        arr[i] = sc.nextInt();
		    int firstOcc =  firstOccurence(arr, x);
		    if(firstOcc!=-1) {
		        // find last occ of x
    		    n = firstOcc+1;
    		    while(n<arr.length && arr[n] == x ) {
    		        n++;
    		    }
    		    System.out.println(n - firstOcc);
		    } else {
		        System.out.println(-1);
		    }
		    
		}
	}
}