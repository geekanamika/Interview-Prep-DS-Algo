/*
Find first repeated character
Given a string S. The task is to find the first repeated character in it. We need to find the character that occurs more than once and whose index of first occurrence is smallest. S contains only lowercase letters.
Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case in a new line print the first repeating character in the string. If no such character exist print -1.

Constraints:
1 <= T <= 100
1 <= |S| <=104

Example:
Input:
2
geeksforgeeks
hellogeeks

Output:
e
l
*/

#include <iostream>
using namespace std;

int checkRepeatedChar(string str) {
    int n = str.length();
    int ch[26] = {0};
    for(int i=0; i<n; i++){
        if(ch[str[i]-'a']>0){
            return str[i]-'a';
        } else {
            ch[str[i]-'a']++;
        }
    }
    return -1;
}

int main() {
	int t;
	int ch;
	string str;
	cin>>t;
	while(t--) {
	    cin>>str;
	    ch = checkRepeatedChar(str);
	    if(ch!=-1)
	        cout<<(char)(ch + 'a')<<endl;
	    else cout<<"-1"<<endl;     
	}
	return 0;
}