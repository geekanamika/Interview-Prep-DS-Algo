/*
Longest Pallindrome substring
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"
Output: "bb"
*/

class Solution {
    public String longestPalindrome(String s) {
        int start = 0;
        
        int n = s.length();
        if(n <= 0)
            return s;
        boolean mat[][] = new boolean[n][n];
        int len = 1;
        // length 1
        for(int i = 0; i < n; i++)
            mat[i][i] = true;
        for(int i = 0; i < n-1; i++) {
            if(s.charAt(i) == s.charAt(i+1)) {
                len = 2;
                mat[i][i+1] = true;
                start = i;
            }
        }
        
        for(int l = 3; l <= n; l++) {
            for(int i = 0; i+l <= n; i++) {
                int j = i + l -1;
                if(mat[i+1][j-1] && s.charAt(i) == s.charAt(j) ){
                    start = i;
                    len = l;
                    mat[i][j] = true;
                }
            }
        }
        return s.substring(start, start+len);
    }
}