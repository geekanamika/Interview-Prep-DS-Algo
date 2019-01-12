#include <stdio.h>
#include<iostream>
#include<cstring>
using namespace std;
// print all substrings of a string
void printAllSubstrings(string str) {
    int i, j, k;
    
    for(i=0; i<str.length(); i++) {
        for(j=i; j<str.length(); j++) {
            cout<<str.substr(i, j-i+1)<<endl;
        }
    }
}
int main() {
	string str = "hi how are you";
	printAllSubstrings(str);
	return 0;
}