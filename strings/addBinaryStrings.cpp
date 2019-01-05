/**
Add Binary Strings
           
Given two binary strings s1 and s2. Print the resultant string after adding given two binary strings.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case contains two binary strings s1 and s2 separated by space.

Output:
For each test case print the resultant binary string.

Constraints:
1 <= T <= 70
1 <= |s1|, |s2| <= 200, where |s| represents the length of string s

Example:
Input:
2
1101 111
10 01

Output:
10100
11
*/

#include<vector>
#include<iostream>
using namespace std;

void addBinaryStrings(string s1, string s2) {
    int i, j;
    int c=0, res, count=0;
    int a, b;
    string result = "";
    for(i = s1.length()-1,j = s2.length()-1; i>=0 || j>=0 || c==1; i--, j--) {
        a = i>=0 ? (s1[i]-'0') : 0;
        b = j>=0 ? (s2[j]-'0') : 0;
        res = a+b+c;
        c = res>>1;
        
        /**
         * most important line here
         * */
        result = char(res % 2 + '0') + result; 
    }
    cout<<result<<endl;
}

int main() {
    string s1, s2;
    int t;
    cin>>t;
    while(t--) {
        cin>>s1;
        cin>>s2;
        addBinaryStrings(s1, s2);
    }
    return 0;
}