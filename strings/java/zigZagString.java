/*
Zigzag String
Asked in:  
Paypal
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P.......A........H.......N
..A..P....L....S....I...I....G
....Y.........I........R
And then read line by line: PAHNAPLSIIGYIR
Write the code that will take a string and make this conversion given a number of rows:

string convert(string text, int nRows);
convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR"
**Example 2 : **
ABCD, 2 can be written as

A....C
...B....D
and hence the answer would be ACBD.
*/

public class Solution {
    public String convert(String str, int row) {
        ArrayList<Character> arr[] = new ArrayList[row];
        
        if (row == 1)
            return str;
        for (int i = 0; i < row; i++) { 
            arr[i] = new ArrayList<Character>(); 
        }
        int i = 0;
        int j=0;
        boolean flag = false;
        while (i < str.length()) {
            if(!flag) {
                j = 0;
            } else {
                j = 1;
            }
            while (i < str.length() && j < row) {
                arr[j].add(str.charAt(i));
                j++;
                i++;
                flag = true;
            }
            j = row - 2;
            while (i < str.length() && j>= 0) {
                arr[j].add(str.charAt(i));
                j--;
                i++;
            }
            
        }
        StringBuffer sb = new StringBuffer();
        for (i=0; i<row; i++) {
            for (char ch : arr[i]) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}