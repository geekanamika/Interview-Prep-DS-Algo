/*
 Longest Substring Without Repeating Characters

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length() <=1 )
                return s.length();
        int start = 0, end = 1, len = 0;
        map.put(s.charAt(0), 0 );
        for(end = 1; end < s.length(); end++ ) {
            if(map.containsKey(s.charAt(end) )) {
                if(map.get(s.charAt(end)) >= start) {
                    len = Integer.max(len, end - start );
                    start = map.get(s.charAt(end)) + 1;
                }
            } 
            map.put(s.charAt(end), end );
        }
        len = Integer.max(len, end - start);
        return len;
    }
}