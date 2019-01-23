/*
Kth Smallest Factor Submissions: 3480   Accuracy: 13.1%   Difficulty: Medium   Marks: 4
     
You will be given two positive integers N and K. You have to find the Kth smallest factor of N. A factor of N is a positive integer which divides N.
 

Input : 
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two space separated positive integers which denote N and K.
 

Output : 
For each test case in a new line print the Kth smallest factor of N if it exists otherwise print -1.
 

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1015
1 ≤ K ≤ 1011
 

Example : 
Input : 
3
4 2
4 3
10 1

Output :
2
4
1
*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long kthSmallestFactor(long num, int k) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        if(k==1)
            return 1;
        for(int i=1; (i*i) <= num; i++) {
            if((num%i) == 0)
                ar.add(i);
        }
        if(k <= ar.size()) {
            return ar.get(k-1);
        } else {
            int n = ar.size();
            int temp;
            int count = n; 
            for(int i=n-1; i>=0; i--){
                temp = ar.get(i);
                if((temp*temp) != num) {
                    count++;
                }
                if(count == k)
                    return num/temp;
                
            }
        }
         return -1; 
    }
    
	public static void main (String[] args) {
		int t,k;
		long num;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
		    t--;
		    num = sc.nextLong();
		    k = sc.nextInt();
		    System.out.println(kthSmallestFactor(num, k));
		}
	}
}