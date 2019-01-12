/*
	WAF to convert a decimal to binary and string binary string
*/

#include <iostream>
#include<algorithm>
using namespace std;

string findBooleanFromDecimal(int m) {
    int flag, i=0;
    string s;
    while(m) {
        flag = m%2;
        s += '0' + flag;
        m = m/2;
    }
    reverse(s.begin(), s.end());
    return s;
}

int main() {
	int t, m;
	cin>>t;
	while(t--) {
	    cin>>m;
	    cout<<findBooleanFromDecimal(m)<<endl;
	}    
	return 0;
}