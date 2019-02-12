/*
Add Binary Strings
Asked in:  
Facebook
Given two binary strings, return their sum (also a binary string).

Example:

a = "100"

b = "11"
Return a + b = “111”.
*/

public class Solution {
    public String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        if (a.length() == 0 )
            return b;
        else if (b.length() == 0)
            return a;
        int i = a.length() - 1;
        int j = b.length()-1;
        
        int carry = 0;
        int sum = 0;
        char ch;
        char[] as = a.toCharArray();
        char[] bs = b.toCharArray();
        while (i>=0 && j>=0) {
            
            sum = (as[i] - '0') + carry + (bs[j]-'0');
            carry = sum/2;
            sum = sum%2;
            sb.insert(0, ""+sum);
            i--;
            j--;
        }
        
        // if i is not 0 yet
        while(i>=0) {
            sum = (as[i] - '0') + carry ;
            carry = sum/2;
            sum = sum%2;
            sb.insert(0, ""+sum);
            i--;
        }
        
        // if j is not 0 yet
        while(j>=0) {
            sum = (bs[j] - '0') + carry ;
            carry = sum/2;
            sum = sum%2;
            sb.insert(0, ""+sum);
            j--;
        }
        
        // carry is not zero yet
        if (carry == 1)
            sb.insert(0, "1");
        return sb.toString();
    }
}