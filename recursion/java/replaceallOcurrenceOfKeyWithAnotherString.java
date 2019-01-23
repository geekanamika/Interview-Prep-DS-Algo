/*
REPLACE ALL Π
Replace all occurrences of pi with 3.14


Input Format:
Integer N, no of lines with one string per line

Constraints:
0 < N < 1000
0 <= len(str) < 1000

Output Format:
Output result one per line

Sample Input:
3
 xpix
 xabpixx3.15x 
xpipippixx
Sample Output:
x3.14x
 xab3.14xx3.15x 
x3.143.14p3.14xx
*/


import java.util.*;
import java.io.*;
public class Main {
    
    static int[] returnIndices(String str, int i) {
        if(i == str.length()-1 )
            return new int[0];
        
        int ret[] = returnIndices(str, i+1);
        //System.out.println(i + " " + str.charAt(i) + " " +str.charAt(i+1) );
        
        if(str.charAt(i) == 'p' && str.charAt(i+1) == 'i' ) {
            //System.out.println(i + " ");
            int res[] = new int[ret.length + 1];
            res[0] = i;
            for(int j=0; j<ret.length; j++) {
                res[j+1] = ret[j];
            }
            return res;
        } else {
            return ret;
        }
    }
   
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine() );
            for(int i=0; i<t; i++) {
                String str = br.readLine();
                int res[] = returnIndices(str, 0);
                StringBuffer sb = new StringBuffer(str);
                for(int j = res.length-1; j>=0; j--) {
                    sb.replace(res[j], res[j]+2, "3.14");
                }
                System.out.println(sb.toString());
                sb.setLength(0);
		    }
        } catch(IOException e) {
            System.out.println("caught ioexception");
        }
		
    }
}