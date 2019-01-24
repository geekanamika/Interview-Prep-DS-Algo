/*
Longest Substring Submissions: 226   Accuracy: 41.16%   Max. Score: 100

Given a string S. The task is to find the longest substring such that characters in the substrings are of the form abcdefgh...xyzabcd... The two adjacent characters should have difference of 1 and the next character should be lexiographically greater than the previous character. However, z can be followed by a, despite a not being lexiograpghically greater.
If there are multiple answers then print the first such string.

Input:
The first line of testcase contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing the string.

Output:
For each testcase, in a new line, print the longest substring and length in separate lines.

Constraints:
1 <= T <= 100
a <= S[i] <= z

Example:
Input:
5
abcd
dcba
xyzabcghij
acegj
abcdfghi

Output:
abcd
4
d
1
xyzabc
6
a
1
abcd
4


*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static String findLongestSubstring(String str) {
        int f1, f2, fs=0, fe=0, s=0, e=0;
        for(int i=0; i<str.length()-1; i++) {
            //System.out.print(str.charAt(i)+ " ");
            f1 = str.charAt(i);
            f2 = str.charAt(i+1);
            if((f2-f1 == 1) && f2>f1) {
                e++;
            } else if (str.charAt(i) == 'z' && str.charAt(i+1) == 'a') {
                e++;
            } else {
                if (e-s > fe-fs) {
                    fs = s;
                    fe = e;
                }
                s = i+1;
                e = i+1;
            }
        }
        if (e-s > fe-fs) {
            fs = s;
            fe = e;
            //System.out.println(fs+ " "+ fe);
        }
        return str.substring(fs, fe+1);
    }
    
	public static void main (String[] args) throws IOException {
		int t;
		BufferedReader bf = new BufferedReader(new InputStreamReader(
		        System.in));
		t = Integer.parseInt(bf.readLine());
		while (t>0) {
		    t--;
		    String str1 = bf.readLine();
		    
		    String res = findLongestSubstring(str1);
		    System.out.println(res);
		    System.out.println(res.length());
		}
	}
}