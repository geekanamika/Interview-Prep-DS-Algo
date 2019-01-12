/**
Anagram
        
Given two strings, check whether two given strings are anagram of each other or not. An anagram of a string is another string that contains same characters, only the order of characters can be different. For example, “act” and “tac” are anagram of each other.

Input: 
The first line of input contains an integer T denoting the number of test cases. Each test case consist of two strings in 'lowercase' only, in a single line.

Output:
Print "YES" without quotes if the two strings are anagram else print "NO".

Constraints:
1 ≤ T ≤ 30
1 ≤ |s| ≤ 1016

Example:
Input:
2
geeksforgeeks forgeeksgeeks
allergy allergic

Output:
YES
NO
*/

#include <iostream>
using namespace std;

string checkAnagram(string s1, string s2) {
    int c[26]= {0};
    
    // character's occurence
    for(int i=0; i<s1.length(); i++) {
            c[s1[i]-'a']++;
    }
    
    for(int i=0; i<s2.length(); i++) {
            c[s2[i]-'a']--;
    }
    // check if all zero or not
    for(int i=0; i<26; i++) {
        if(c[i]!=0)
            return "NO";
    }
    return "YES";
}

int main() {
	string s1, s2;
	int t;
	cin>>t;
	while(t--) {
	    cin>>s1;
	    cin>>s2;
	    cout<<checkAnagram(s1, s2)<<endl;
	}
	return 0;
}