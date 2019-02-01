/*
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
    public String longestPalindrome(String str) {
        if (str.length() == 1  || str.length() == 0)
            return str;
        int start=0, max=1;
        int n = str.length();
        boolean f[][] = new boolean[n][n];
        // 1 length
        for(int i=0; i<n; i++){
            f[i][i] = true;
        }
        // length 2 
        for (int j=0; j<n-1; j++) {
            if(str.charAt(j) == str.charAt(j+1))  {
                f[j][j+1] = true;
                start = j;
                max = 2;
            }
        }
        if (n == 2)
            return str.substring(start, max);
        
        int j, k,i;
        for(k = 3; k<=n; k++) {
            for(i = 0; i<n-k+1; i++) {
                j = i+k-1;
                if (f[i+1][j-1] && str.charAt(j) == str.charAt(i)) {
                    f[i][j] = true;
                    if (k > max) {
                        start = i;
                        max = k;
                    }
                    
                }
            }
        }
        return str.substring(start ,start+max);
    }
}