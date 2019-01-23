/*
Factors Sum Submissions: 1290   Accuracy: 35.94%   Difficulty: Basic   Marks: 1
     
Given a number N, the task is to find the sum of all the divisors .

Input:
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows, a single line of the input containing a positive integer N.

Output:
For each testcase, print the sum of all divisors/factors.

Constraints:
1<=T<=100
1<=N<=1000000

Example:
Input:
2
30
15

Output:
72
24

Explanation:
Testcase 1: Factors sum 1 + 2 + 3 + 5 + 6 + 10 + 15 + 30 = 72
Testcase 2: Factors sum 1 + 3 + 5 + 15 = 24
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long getFactorSum(int num) {
        boolean freq[] = new boolean[num+1];
        int p=2;
        int sq = 4;
        while(sq <= num) {
            
            while(sq<=num) {
                freq[sq] = true;
                sq+=p;
            }
            
            p++;
            while(true) {
                if(freq[p] == false)
                    break;
                p++;    
            }
            sq = p*p;
        }
        
        // store all primes
        ArrayList<Integer> pr = new ArrayList<Integer>();
        for(int i=2; i<=num; i++) {
            if((freq[i] == false) && ((num%i) == 0))
                pr.add(i);
        }
        //System.out.println(p);
        if(pr.size() == 0 ){
            return (1 + num);
        }
        int i;
        long res = 1;
        for(int j=0; j<pr.size(); j++ ) {
            i = pr.get(j);
            long cs = 1, ct = 1;
            
            while(num % i ==0) {
                num = num/i;
                ct *= i;
                cs += ct;
            }
            res *= cs;
        }
        return res;
    }
    
	public static void main (String[] args) {
		int t;
		int num;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t>0) {
		    t--;
		    num = sc.nextInt();
		    System.out.println(getFactorSum(num));
		}
	}
}