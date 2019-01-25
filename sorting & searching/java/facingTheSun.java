/*
Facing the sun
         
Monu lives in a society which is having high rise buildings. This is the time of sunrise and monu wants see the buildings receiving the sunlight. Help him in counting the number of buildings recieving the sunlight.
Given an array H representing heights of buildings. You have to count the buildings which will see the sunrise (Assume : Sun rise on the side of array starting point).

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N, N is the number of buildings. The second line of each test case contains N input H[i], height of ith building.

Output:
Print the total number of buildings which will see the sunset.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 ≤ Hi ≤ 108

Example:
Input:
2
5
7 4 8 2 9
4
2 3 4 5

Output:
3
4
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    private static int getSunFacingBuildings(int arr[]) {
        int count = 1, h = arr[0];
        for(int i=1; i<arr.length; i++) {
            if(arr[i] > h) {
                h = arr[i];
                count++;
            }
        }
        return count;
    }
    
	public static void main (String[] args) {
		int t, n;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while (t>0) {
		    t--;
		    n = sc.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n; i++)
		        arr[i] = sc.nextInt();
		        
		    System.out.println(getSunFacingBuildings(arr));
		    
		}
	}
}