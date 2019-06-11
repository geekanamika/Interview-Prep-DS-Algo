/*
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I

*/
class Solution {
    public String convert(String s, int numRows) {
        
        int as, bs;
        int pos;
        int n = s.length();
        if (n <= 1 || numRows <= 1 || numRows >= n)
            return s;
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < numRows && i < n; i++) {
            as = (numRows - i - 1)*2;
            bs = 2 * i;
            pos = i;
            sb.append(s.charAt(pos) );
            
            while(true) {
                pos += as;
                if(pos >= n)
                    break;
                if(as != 0) {
                    sb.append(s.charAt(pos) );
                }
                pos += bs;
                if(pos >= n)
                    break;
                if(bs != 0) {
                    sb.append(s.charAt(pos) );
                }
            }
        }
        return sb.toString();
    }
}