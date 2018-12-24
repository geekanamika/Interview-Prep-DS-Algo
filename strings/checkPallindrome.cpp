/*
Palindrome String
Given a string S, check if it is palindrome or not.

Input:
The first line contains 'T' denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line contains the length of the string and the second line contains the string S.

Output:
For each testcase, in a new line, print "Yes" if it is a palindrome else "No". (Without the double quotes)

Constraints:
1 <= T <= 30
1 <= N <= 100

Example:
Input:
1
4
abba
Output:
Yes
*/

#include <iostream>
using namespace std;

bool checkPalindrome( char *str, int n) {
    int i;
    for(i=0; i<n/2; i++) {
        if(str[i]!=str[n-i-1])
            return false;
    }
    return true;
}

int main() {
	int t, n;
	char str[100];
	cin>>t;
	while(t--) {
	    cin>>n;
	    for(int i=0; i<n; i++) {
	        cin>>str[i];
	    }
	    if(checkPalindrome(str, n))
	        cout<<"Yes"<<endl;
	    else cout<<"No"<<endl;     
	}
	return 0;
}