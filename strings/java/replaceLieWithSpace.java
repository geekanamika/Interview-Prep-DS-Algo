/**
Extraction of secret message Submissions: 1587   Accuracy: 29%   Difficulty: Basic   Marks: 1
     

Mridushi likes to play with strings. One day Vaibhav challenged her and gave her some strings. Each string contains some secret message. Vaibhav mixed the secret message with some specified substring "LIE" .

For eg. "I AM COOL" is given as "LIELIEILIEAMLIECOOL".

But Mridushi has to leave for some urgent work. So in the absence of her, help to find out the secret message.
 

Input:

First line contains the number of test cases, T.
First line of each test case contains the string, M.

Output:

Print the secret message.
 

Constraints:

1<=T<=10
Length of string doesnt exceed 200 characters.


Example:

Input

2
LIELIEILIEAMLIECOOL
LIELIEABCLIELIELIE
 

Output
I AM COOL
ABC

*/

import java.util.*;
import java.io.*;
public class Main {
    
    static String replaceKey(String str) {
        StringBuffer sb = new StringBuffer(str);
            String key = "LIE";
            int index = sb.indexOf(key);
            while(index != -1) {
                if(index == 0 || sb.charAt(index-1) == ' ')
                    sb.replace(index, index+3, "");
                else {
                    sb.replace(index, index+3, " ");
                }    
                index = sb.indexOf(key);
            }
            return sb.toString();
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine() );
            for(int i=0; i<t; i++) {
                String str = br.readLine();
                str = replaceKey(str);
                System.out.println(str );
               
		    }
        } catch(IOException e) {
            System.out.println("caught ioexception");
        }
		
    }
}