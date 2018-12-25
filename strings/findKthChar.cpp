/*
Given a decimal number m. Convert it in binary string and apply n iterations, in each iteration 0 becomes 01 and 1 becomes 10. Find kth character in the string after nth iteration.

Input:
The first line consists of an integer T i.e number of test cases. The first and only line of each test case consists of three integers m,k,n. 

Output:
Print the required output.

Constraints: 
1 <= T <= 100
1 <= m <= 50
1 <= n <= 10
0 <= k <|Length of final string|

Example:
Input:
2
5 5 3
11 6 4

Output:
1
1
*/

#include <iostream>
#include<algorithm>
#include<math.h>
using namespace std;

string findBooleanFromDecimal(int m) {
    int flag, i=0;
    string s;
    while(m) {
        flag = m%2;
        s += '0' + flag;
        m = m/2;
    }
    //s[i] = '\0';
    //cout<<s<<endl;
    reverse(s.begin(), s.end());
    return s;
}

int findKthCharacter(int m, int k, int n) {
      string s;
      int block = k/(pow(2, n));
      k = k % ((int)pow(2,n));
      s = findBooleanFromDecimal(m);
      
      s = s[block];
      string s1 = "";
      // find root block by creating it's string
      for(int i=0; i<n; i++) {
        for(int j=0; j<s.length(); j++) {
            if(s[j] == '0')
                s1 += "01";
            else {
                s1 += "10";
            }    
        } 
        s = s1;
        s1 = "";
      }
      
      return s[k] - '0';
}

int main() {
	int t, m, n, k;
	cin>>t;
	while(t--) {
	    cin>>m>>k>>n;
	    //cout<<findBooleanFromDecimal(m)<<endl;
	    cout<<findKthCharacter(m, k, n)<<endl;
	}    
	return 0;
}