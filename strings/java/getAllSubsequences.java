/* return all subsequences of a string in an arraylist */

import java.io.*;
import java.util.*;

class GFG {
    
    private static ArrayList<String> printAllSubsequences(String str) {
        if(str.length() ==0 )   /* base case */ {
            ArrayList<String> baseString = new ArrayList<String>();
            baseString.add("");
            return baseString;
        }
        char c = str.charAt(0);
        ArrayList<String> myResult = new ArrayList<String>();
        ArrayList<String> recResult = printAllSubsequences(str.substring(1) );
        for (int i=0; i<recResult.size(); i++ ) {
            myResult.add(recResult.get(i) );
            myResult.add(c + recResult.get(i) );
            // this line can help in adding ascii character in list too
            // [, a, 97, b, ab, 97b, 98, a98, 9798]
            // myResult.add((int)c + recResult.get(i));
        }
        return myResult;
    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<String> list = printAllSubsequences(str);
        System.out.println(list);
    }
} */

import java.io.*;
import java.util.*;

class GFG {
    
    private static ArrayList<String> printAllSubsequences(String str) {
        if(str.length() ==0 )   /* base case */ {
            ArrayList<String> baseString = new ArrayList<String>();
            baseString.add("");
            return baseString;
        }
        char c = str.charAt(0);
        ArrayList<String> myResult = new ArrayList<String>();
        ArrayList<String> recResult = printAllSubsequences(str.substring(1) );
        for (int i=0; i<recResult.size(); i++ ) {
            myResult.add(recResult.get(i) );
            myResult.add(c + recResult.get(i) );
        }
        return myResult;
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		ArrayList<String> list = printAllSubsequences(str);
		System.out.println(list);
	}
}