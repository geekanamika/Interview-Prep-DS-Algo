/*
Searching a number Submissions: 16722   Accuracy: 34.42%   Difficulty: Basic   Marks: 1
Associated Course(s):   Interview Preparation
      
Given an array of N elements and a integer K. Your task is to return the position of first occurence of K in the given array.
Note: Position of first element is considered as 1.

Input:
First line of input contains T denoting the number of testcases. For each testcase there will be two space separated integer N and K denoting the size of array and the value of K respectively. The next line contains the N space separated integers denoting the elements of array.

Output:
For each test case, print the index of first occurrence of given number K. Print -1 if the number is not found in array.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= K <= 106
1 <= A[i] <= 106

Example:
Input :
2 
5 16
9 7 2 16 4
7 98
1 22 57 47 34 18 66

Output : 
4
-1
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static int firstOccurence(int arr[], int x){
        int i=0;
        while(i<arr.length && arr[i]!=x) {
            i++;
        }
        if(i < arr.length)
            return i+1;
        else     
            return -1;
    }
    
	public static void main (String[] args) throws IOException {
		int t, n, x;
		String line;
		int firstOcc;
		String[] strs;
		//Scanner sc = new Scanner(System.in);
		BufferedReader bf = new BufferedReader(new InputStreamReader(
		                        System.in) );
		t = Integer.parseInt(bf.readLine());
		
		while (t>0) {
		    t--;
		    
		    line = bf.readLine(); 
            strs = line.trim().split("\\s+");
            
            n = Integer.parseInt(strs[0]);
            x = Integer.parseInt(strs[1]);
            int arr[] = new int[n];
            
            line = bf.readLine(); 
            strs = line.trim().split("\\s+");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(strs[i]);
            }
		    
		          
		    firstOcc = firstOccurence(arr, x);
		    System.out.println(firstOcc);
		    
		}
	}
}