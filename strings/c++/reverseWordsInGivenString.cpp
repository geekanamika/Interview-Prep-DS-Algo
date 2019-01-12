/**
Reverse words in a given string
Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.

Input:
The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.

Output:
For each test case, in a new line, output a single line containing the reversed String.

Constraints:
1 <= T <= 100
1 <= |S| <= 2000

Example:
Input:
2
i.like.this.program.very.much
pqr.mno

Output:
much.very.program.this.like.i
mno.pqr
*/

#include <iostream>
#include<vector>
using namespace std;

void printReverseWords(string str){
    vector<int> dots;
    int i;
    // dots store the index of all separation, adding -1 as begining 
    // adding str.length() as end of separation
    dots.push_back(-1);
    for(i=0; i<str.length(); i++) {
        if(str[i] == '.')
            dots.push_back(i);
    }
    dots.push_back(i);
    i = dots.size()-1;
    // print words in range as selected
    while(i>0) {
        
        cout<<str.substr(dots[i-1]+1,dots[i]-dots[i-1]-1 );
        if(i>1)
            cout<<".";
        i--;
    }
    cout<<endl;
}


int main() {
    string str;
    int t;
    cin>>t;
    while(t--) {
        //cin>>n;
        cin>>str;
        printReverseWords(str);
    }
    return 0;
}