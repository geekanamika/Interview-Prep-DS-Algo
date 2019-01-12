/**
Sort the string in descending order
      
Given a string S containing only lower case alphabets, the task is to sort it in lexigraphically-descending order.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains a string S.

Output:
For each test case, in a new line, print the sorted string.

Constraints:
1 <= T <= 100
1 <= |S| <= 105

Example:
Input:
2
geeks
for
Output:
skgee
rof
*/

#include <iostream>
using namespace std;

void printInDescendingLexo(string str) {
    int c[26]= {0};
    // character's occurence
    for(int i=0; i<str.length(); i++) {
        //if(str[i]>='a' && str[i]<='z')
            c[str[i]-'a']++;
    }
    // print in descending order
    for(int i=25; i>=0; i--) {
        while(c[i]--) {
            cout<<(char)('a'+i);
        }
    }
    cout<<endl;
}

int main() {
	string str;
	int t;
	cin>>t;
	while(t--) {
	    cin>>str;
	    printInDescendingLexo(str);
	}
	return 0;
}