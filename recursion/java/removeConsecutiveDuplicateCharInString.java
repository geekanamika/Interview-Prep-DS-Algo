/*
REMOVE DUPLICATES CHARACTERS
Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are reduced to a single char. E.g. for “hello” return “helo”. Print the value returned.


Input Format:
Enter the string

Constraints:
None

Output Format:
Display the resulting string

Sample Input:
hello
Sample Output:
helo
*/

import java.util.*;
public class Main {
    
    static String removeDuplicates(String str) {
        // base case 
        if(str.length() == 0)
            return "";
        char ch = str.charAt(0);
        
        String recRes = removeDuplicates(str.substring(1));
        if(recRes.length()>0 ) {
            if(recRes.charAt(0) != ch)
                return ch + recRes;
            else 
                return recRes;    
        } 
        else return ""+ch;
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(removeDuplicates(str) );
    }
}