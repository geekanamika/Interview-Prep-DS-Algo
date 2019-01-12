/**
Merge two strings
        
Given two strings S1 and S2 as input, the task is to merge them alternatively i.e. the first character of S1 then the first character of S2 and so on till the strings end.

NOTE: Add the whole string if other string is empty.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two strings S1 and S2.

Output:
For each test case, in a new line, print the merged string.

Constraints:
1 <= T <= 100
1 <= |S1|, |S2| <= 104

Example:
Input:
2
Hello Bye
abc def

Output:
HBeylelo
adbecf
*/

#include <iostream>
using namespace std;

void mergeStrings(string s1, string s2) {
    int l1 = s1.length();
    int l2 = s2.length();
    int i=0, j=0, c=0;
    while(i<l1 && j<l2) {
        if(c&1) {
            cout<<s2[j];
            j++;
        } else {
            cout<<s1[i];
            i++;
        }
        c++;
    }
    while(i<l1) {
        cout<<s1[i];
        i++;
    }
    while(j<l2) {
        cout<<s2[j];
        j++;
    }
    cout<<endl;
}

int main() {
	string s1, s2;
	int t;
	cin>>t;
	while(t--) {
	    cin>>s1;
	    cin>>s2;
	    mergeStrings(s1, s2);
	}
	return 0;
}