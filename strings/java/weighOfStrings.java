/*
Weigh the strings Submissions: 437   Accuracy: 49.2%   Max. Score: 100

The weight W of a string is defined by the formula, W = sum of ASCII values of characters in the string. Now, you are given two strings S1 and S2, and the task is to find the heavier string.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines containing two strings S1 and S2.

Output:
Print the string with heavier weight. Print "equal"(without quotes) if weight of both strings are equal.

Constraints:
1 <= T <= 100
1 <= |S| <= 106
a <= S1[i], S2[i] <= z

Example:
Input:
1
z
a

Output:
z

Explanation:
Testcase 1: ASCII value of z is greater than a.


*/
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static long getWeight(String str) {
        int flag;
        long sum =0;
        for(int i=0; i<str.length(); i++ ) {
            flag = str.charAt(i);
            sum+= flag;
        }
        return sum;
    }
    
	public static void main (String[] args) throws IOException {
		int t;
		BufferedReader bf = new BufferedReader(new InputStreamReader(
		        System.in));
		t = Integer.parseInt(bf.readLine());
		while (t>0) {
		    t--;
		    String str1 = bf.readLine();
		    String str2 = bf.readLine();
		    long s1 = getWeight(str1);
		    long s2 = getWeight(str2);
		    
		    if(s1 == s2) {
		        System.out.println("equal");
		    } else {
		        if(s1 > s2)
		            System.out.println(str1);
		        else 
		            System.out.println(str2);
		    }
		}
	}
}