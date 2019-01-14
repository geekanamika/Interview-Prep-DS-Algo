/**
Excel Column Number
Asked in:  
Amazon
Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 

*/

public class Solution {
    public int titleToNumber(String A) {
        int res = 0;
        int p = 1;
        
        for(int i=A.length()-1; i>=0; i--) {
            res += p * getCVal(A.charAt(i) );
            //System.out.println(res + " " + p + " " + i +" "  + getCVal(A.charAt(i) ) );
            p*=26;
        }
        return res;
    }
    
    int getCVal(char s) {
        return (s - 64); 
    }
    int power(int x, int y) {
        if (y==0)
            return 1;
        return x * power(x, y-1);    
    }
}
