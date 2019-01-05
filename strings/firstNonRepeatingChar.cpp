/**
Non Repeating Character
                               
Given a string S consisting of lowercase Latin Letters. Find the first non repeating character in S.

Input:
The first line contains T denoting the number of testcases. Then follows description of testcases.
Each case begins with a single integer N denoting the length of string. The next line contains the string S.

Output:
For each testcase, print the first non repeating character present in string. Print -1 if there is no non repeating character.

Constraints:
1 <= T <= 900
1 <= N <= 104

Example:
Input : 
3
5  
hello
12
zxvczbtxyzvy
6
xxyyzz

Output :
h
c
-1
*/

#include <iostream>
using namespace std;

void printFirstNonDuplicateChar(string str) {
    int c[26]= {0};
    bool flag = false;
    // character's occurence
    for(int i=0; i<str.length(); i++) {
            c[str[i]-'a']++;
    }
    // check for i=0 to n-1 till str[i]'s occurence value in c[] is 1
    for(int i=0; i<str.length(); i++) {
        if(c[str[i]-'a'] ==1) {
            cout<<str[i]<<endl;
            return;
        }
    }
    cout<<"-1"<<endl;
}

int main() {
    string str;
    int t,n;
    cin>>t;
    while(t--) {
        cin>>n;
        cin>>str;
        printFirstNonDuplicateChar(str);
    }
    return 0;
}