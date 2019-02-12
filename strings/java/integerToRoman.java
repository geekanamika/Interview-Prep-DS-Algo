/*
Integer To Roman
Another question which belongs to the category of questions which are intentionally stated vaguely. 
Expectation is that you will ask for correct clarification or you will state your assumptions before you start coding.

Given an integer, convert it to a roman numeral, and return a string corresponding to its roman numeral version

Input is guaranteed to be within the range from 1 to 3999.


*/

public class Solution {
    public String intToRoman(int num) {
        int n = num;
        int len = 0;
        
        if (num == 0)
            return "";
        StringBuffer sb = new StringBuffer("");
        
        while (num!=0) {
            int last = num%10;
            String s = getRoman(last, len);
            len++;
            num /= 10;
            sb.insert(0, s);
        }
        
        return sb.toString();
    }
    
    String getRoman(int last , int len) {
       
        if (len == 0) {
            String[] one = new String[] {
                "", "I", "II", "III","IV","V","VI", "VII","VIII","IX"
            };
            return one[last];
        } else if (len == 1) {
            String[] two = new String[] {
                "", "X", "XX", "XXX","XL","L","LX", "LXX","LXXX","XC"
            };
            return two[last];
        } else if (len == 2) {
            String[] three = new String[] {
                "", "C", "CC", "CCC","CD","D","DC", "DCC","DCCC","CM"
            };
            return three[last];
        } else {
            
            String[] four = new String[] {
                "", "M", "MM", "MMM"
            };
            return four[last];
        }
        
       // return "";
    }
}
