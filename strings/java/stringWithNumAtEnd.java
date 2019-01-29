/*
String with numbers at its end
Given a string (S) that is appended with a number at last. You need to find whether the length of string excluding that number is equal to that number. For example for “helloworld10”, answer is True as helloworld consist of 10 letters. 
Examples:

Input:  S = "geeks5"
Output:  1
Explanation : As geeks is of 5 length and at 
              last number is also 5.

Input:  S = "geeksforgeeks15"
Output:  0
Explanation: As geeksforgeeks is of 13 length and
             at last number is 15 i.e. not equal


Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case in a new line print 1 if the condition holds else print 0.

Constraints:
1<=T<=100
1<=Length of string<=1000

Example:
Input:
2
geeks5
geeksforgeeks15
Output:
1
0
 */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
    static void stringNumAtEnd(String str) {
        int n = str.length()-1;
        char ch;
        int count =0 ;
        while(true) {
            ch = str.charAt(n);
            if(!(ch >= '0' && ch<= '9')) {
                break;
            }
            count++;
            n--;
        }
        int num = Integer.parseInt(
            str.substring(n+1,str.length()));
            
        // rest of length 
        if((n+1) == num)
            System.out.println(1);
        else
            System.out.println(0);
    }
    
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
		    new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String str;
		while(t>0) {
		    t--;
		    str = br.readLine();
		    stringNumAtEnd(str);
		    
		}
	}
}