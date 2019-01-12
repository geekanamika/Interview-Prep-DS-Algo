/**
Longest Distinct characters in string
            
Given a string S, find length of the longest substring with all distinct characters.  For example, for input "abca", the output is 3 as "abc" is the longest substring with all distinct characters.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is String str.

Output:
Print length of smallest substring with maximum number of distinct characters.
Note: The output substring should have all distinct characters.

Constraints:
1 ≤ T ≤ 100
1 ≤ size of str ≤ 10000

Example:
Input:
2
abababcdefababcdab
geeksforgeeks

Output:
6
7


*/

#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int longestDistinctSubString(string str) {
    int l = str.length(), prev,i;
    vector<int> vstd(256,-1);
    int len = 1, s=0,start;
    vstd[str[0]] = 0;
    for(i=1; i<l; i++) {
        prev = vstd[str[i]];
        // not visited or occurence before sub-string starts
        if(prev == -1 || prev < s) {
            vstd[str[i]] = i;
        } else {    // occured earlier in range or s->i
            
            if((i-s)>len) {
                start = s;
                len = (i-s);
            }
            
            //cout<<str.substr(s, (i-s))<<endl;
            s = prev+1;
        }
        // mark str[i] at last occured at ith position for future ref
        vstd[str[i]] = i;
    }
    if((i-s)>=len) 
    {
        len = (i-s);
        start = s;
    }
    // printing longest distinct substring
    //cout<<str.substr(start, len)<<endl;
    //cout<<endl;
    return len;
}

int main() {
    string str;
    int t;
    cin>>t;
    while(t--) {
        cin>>str;
        cout<<longestDistinctSubString(str)<<endl;
    }
    return 0;
}