/*
Extract Maximum
You have been given an alphanumeric string S, extract maximum numeric value from that string. Alphabets will only be in lower case.

Input:
The first line contains a single integer T i.e. the number of test cases. T testcases follow. The first and only line consists of a String S.

Output: 
For each testcase, in a new line, print the Maximum number extracted from the string S.

Constraints:
1 <= T <= 100
2 <= |S| <= 200

Example:
Input:
3
100klh564abc365bg
abvhd9sdnkjdfs
abchsd0sdhs
Output:
564
9
0

Explanation:
Test Case 1: The maximum number found in the string is "564".  
*/

#include <iostream>
using namespace std;

int printMaxNumberInGivenStr(string str) {
    bool flag=false;
    int prev=0, max=0;
    int n = str.length();
    for(int i=0; i<n; i++) {
        if(str[i]-'0'>=0 && str[i]-'0'<=9) {
            if(flag) {
                prev = (prev*10) + (str[i]-'0');
                flag = true;
            } else {
                prev=0;
                prev = (str[i]-'0');
                flag = true;
            }
        } else {
            if(flag && max<prev) {
                max = prev;
            }
            flag = false;
        }
    }
    max = max > prev ? max : prev;
    return max;
}

int main() {
	int t;
	cin>>t;
	while(t--) {
	    string str;
	    cin>>str;
	    cout<<printMaxNumberInGivenStr(str)<<endl;
	}
	return 0;
}