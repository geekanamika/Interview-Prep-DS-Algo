/*
Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++ ) {
            char ch = s.charAt(i);
            if (ch == '(')
                st.push(')');
            else if (ch == '{')
                st.push('}');
            else if (ch == '[')
                st.push(']');
            else {
                if (st.isEmpty() || st.pop() != ch )
                    return false;
            }
        }
        return st.isEmpty();
    }
}