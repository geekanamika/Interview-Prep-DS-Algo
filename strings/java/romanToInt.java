/*
Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

Read more details about roman numerals at Roman Numeric System

Example :

Input : "XIV"
Return : 14
Input : "XX"
Output : 20
*/

public class Solution {
    public int romanToInt(String str) {
        if (str.length() == 0 ){
            return 0;
        }
        
        int n =str.length();
        int res = 0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='M') {
                res += 1000;
            } else if (str.charAt(i) == 'D') {
                res += 500;
            } else if (str.charAt(i) == 'L' ) {
                res += 50;
            }  else if (str.charAt(i) == 'V' ) {
                res += 5;
            }
            else if (str.charAt(i) == 'C') {
                if ((i+1) <n && str.charAt(i+1) == 'D') {
                    res += 400;
                    i++;
                }else if ((i+1) <n && str.charAt(i+1) == 'M') {
                    res += 900;
                    i++;
                } else {
                    res+=100;
                }
            } else if (str.charAt(i) == 'X') {
                if ((i+1) <n && str.charAt(i+1) == 'L') {
                    res += 40;
                    i++;
                }else if ((i+1) <n && str.charAt(i+1) == 'C') {
                    res += 90;
                    i++;
                } else {
                    res+=10;
                }
            } else if (str.charAt(i) == 'I') {
                if ((i+1) <n && str.charAt(i+1) == 'V') {
                    res += 4;
                    i++;
                }else if ((i+1) <n && str.charAt(i+1) == 'X') {
                    res += 9;
                    i++;
                } else {
                    res++;
                }
            } 
        }
        return res;
    }
}
