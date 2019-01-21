/*
Permutations of a given string Submissions: 34936   Accuracy: 32.48%   Difficulty: Basic   Marks: 1
Associated Course(s):   Interview Preparation   Geeks Classes in Noida More
                     
Given a string, print all permutations of a given string.

Input:
The first line of input contains an integer T, denoting the number of test cases. Each test case contains a single string S in capital letter.

Output:
For each test case, print all permutations of a given string S with single space and all permutations should be in lexicographically increasing order.

Constraints:
1 ≤ T ≤ 10
1 ≤ size of string ≤ 5

Example:
Input:
2
ABC
ABSG

Output:
ABC ACB BAC BCA CAB CBA 
ABGS ABSG AGBS AGSB ASBG ASGB BAGS BASG BGAS BGSA BSAG BSGA GABS GASB GBAS GBSA GSAB GSBA SABG SAGB SBAG SBGA SGAB SGBA
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    private static ArrayList<String> printAllSubsequences(String str) {
        if(str.length() ==0 )   /* base case */ {
            ArrayList<String> baseString = new ArrayList<String>();
            baseString.add("");
            return baseString;
        }
        char c = str.charAt(0);
        ArrayList<String> myResult = new ArrayList<String>();
        ArrayList<String> recResult = printAllSubsequences(
            str.substring(1) );
        for (int i=0; i<recResult.size(); i++ ) {
            
            for(int j=0; j<=recResult.get(i).length(); j++ ) {
                StringBuffer s = new StringBuffer(recResult.get(i));
                s.insert(j, c);
                myResult.add(s.toString() );
            }
        }
        //System.out.println(myResult);
        return myResult;
    }
    
    
	public static void main (String[] args) throws IOException {
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new
                            InputStreamReader(System.in)); 
                            
		int t = Integer.parseInt(br.readLine() );
		while (t>0) {
		    String str = br.readLine();
		    ArrayList<String> list = printAllSubsequences(str);
    		Collections.sort(list);
    		for(int i=0; i<list.size(); i++) {
    		    System.out.print(list.get(i) + " " );   
    		}
    		System.out.println();
    		t--;
		}
		
	}
}