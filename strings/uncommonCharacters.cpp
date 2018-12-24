/*
Uncommon characters
Find and print the uncommon characters of the two given strings S1 and S2. Here uncommon character means that either the character is present in one string or it is present in other string but not in both. The strings contains only lowercase characters and can contain duplicates.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains two strings in two subsequent lines.

Output:
For each testcase, in a new line, print the uncommon characters of the two given strings in sorted order.

Constraints:
1 <= T <= 100
1 <= |S1|, |S2| <= 105

Example:
Input:
1
characters
alphabets
Output:
bclpr
*/

#include <iostream>
using namespace std;

void printUncommonChar(string str1, string str2) {
    int i;
    char ch;
    int ch1[26]={0}, ch2[26]={0};
    // making ch1 array
    for(i=0; i<str1.length(); i++) {
        ch1[(str1[i]-'a')]++;
    }

    // making ch2 array
    for(i=0; i<str2.length(); i++) {
        ch2[(str2[i]-'a')]++;
    }
    
    // check uncommon char & print them in sorted order
    for(i=0; i<26; i++) {
        if(ch1[i]==0 && ch2[i]>0) {
            //cout<<(char)('a'+ch1[i]);
            ch = i + 'a';
            cout<<ch;
        }
            
        else if (ch2[i]==0 && ch1[i]>0) {
            //cout<<(char)('a'+ch2[i]);
            ch = i + 'a';
            cout<<ch;
        }
            
    }
}

int main() {
	int t;
	cin>>t;
	while(t--) {
	    string str1, str2;
	    cin>>str1;
	    cin>>str2;
	    printUncommonChar(str1, str2);
	    cout<<endl;
	}
	return 0;
}