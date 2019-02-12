/*
Reverse Words in a String III

Given a string, you need to reverse the order of characters
 in each word within a sentence while still preserving whitespace
  and initial word order.

Example 1:
Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Note: In the string, each word is separated by single space
 and there will not be any extra space in the string.
*/

class Solution {
    public String reverseWords(String str) {
        if (str.length() == 0)
            return str;
        StringBuilder sb = new StringBuilder(str);
        int len = str.length()-1;
        int s = 0 , index = -2, e;
        char temp;
        while(true) {
            s = index+2;
            e = s+1;
            while(e <=len && sb.charAt(e)!= ' ') {
                e++;
            }
            
            e--;
            index = e;
            if (e == len)
                break;
            
            while(s < e) {
                temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);
                e--;
                s++;
            }
        }
        
        while(s < e) {
                temp = sb.charAt(s);
                sb.setCharAt(s, sb.charAt(e));
                sb.setCharAt(e, temp);
                e--;
                s++;
            }
        return sb.toString();
        
    }
}