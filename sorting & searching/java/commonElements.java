/*
Common elements Submissions: 17148   Accuracy: 21.63%   Difficulty: Easy   Marks: 2
Associated Course(s):   Interview Preparation
           
Given three increasingly sorted arrays A, B, C of sizes N1, N2, and N3 respectively, you need to print all common elements in these arrays.

Note: Please avoid printing the same common element more than once.

Input:
First line contains a single integer T denoting the total number of test cases. T testcases follow. Each testcase contains four lines of input. First line consists of 3 integers N1, N2 and N3, denoting the sizes of arrays A, B, C respectively. The second line contains N1 elements of A array. The third lines contains N2 elements of B array. The fourth lines contains N3 elements of C array.

Output:
For each testcase, print the common elements of array. If not possible then print -1.

Constraints:
1 <= T <= 100
1 <= N1, N2, N3 <= 107
1 <= Ai, Bi, Ci <= 1018

Example:
Input:
1
6 5 8
1 5 10 20 40 80
6 7 20 80 100
3 4 15 20 30 70 80 120
Output:
20 80

Explanation:
Testcase1:  20 and 80 are the only common elements
*/


import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
		    new InputStreamReader(System.in) );
		int t = Integer.parseInt(br.readLine() );
		
		int n1, n2, n3,i, flag;
		boolean ch;
		String str;
		String s[];
		while(t>0) {
		    t--;
		    ch = false;
		    str = br.readLine();
		    s = str.trim().split("\\s+");
		    
		    n1 = Integer.parseInt(s[0]);
		    n2 = Integer.parseInt(s[1]);
		    n3 = Integer.parseInt(s[2]);
		    
		    str = br.readLine();
		    s = str.trim().split("\\s+");
		    HashSet h1 = new HashSet();
		    for(i=0; i<n1; i++) {
		        h1.add(Integer.parseInt(s[i]));
		    }
		    
		    str = br.readLine();
		    s = str.trim().split("\\s+");
		    HashSet h2 = new HashSet();
		    for(i=0; i<n2; i++) {
		        h2.add(Integer.parseInt(s[i]));
		    }
		    
		    str = br.readLine();
		    s = str.trim().split("\\s+");
		    HashSet h3 = new HashSet();
		    for(i=0; i<n3; i++) {
		        flag = Integer.parseInt(s[i]);
		        if(h1.contains(flag) && h2.contains(flag) && (!h3.contains(flag)) ) {
		            System.out.print(flag + " " );
		            h3.add(flag);
		            ch = true;
		        }
		    }
		    if(ch == false)
		        System.out.print("-1");
		    System.out.println();
		}
	}
}