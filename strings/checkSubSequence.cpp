/*
Check for subsequence
Given two strings A and B, find if A is a subsequence of B.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains two space separated strings A and B.

Output:
For each test case, in a new line, print 1 if a is sub-sequences of b else print 0.

Constraints:
1 <= T <= 900
1<= |A|,|B| <=104

Example:
Input:
2
AXY YADXCP
gksrek geeksforgeeks

Output:
0
1

Explanation:
Testcase1: 
Input: A = "axy", B = "yadxcp"
Output: 0 (A is not a subsequence of B)
Testcase2:
Input: A = "gksrek", B = "geeksforgeeks"
Output: 1 (str1 is a subsequence of str2)
*/


#include <iostream>
using namespace std;

bool checkSubSequence(string str, string ch) {
    int i, j=0;
    int n = str.length();
    int m = ch.length();
    for(i=0; i<n && j<m; i++) {
        if(str[i] == ch[j]){
            j++;
        }
            
    }
    if(j>=m)
        return true;
    else return false;    
}

int main() {
	int t;
	cin>>t;
	while(t--) {
	    string str, ch;
	    cin>>ch;
	    cin>>str;
	    if(checkSubSequence(str, ch))
	        cout<<"1"<<endl;
	    else cout<<"0"<<endl;     
	}
	return 0;
}