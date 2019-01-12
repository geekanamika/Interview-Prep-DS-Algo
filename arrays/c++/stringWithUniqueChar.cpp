#include <stdio.h>
#include<iostream>
#include<cstring>

using namespace std;
// print all substrings of a string
bool allUniqueCharacters(string str) {
    int i, j, k;
    int freq[26]={0};
    for(i=0; i<str.length(); i++) {
        freq[str[i]-'a']++;
    }
    for(int i=0; i<26; i++) {
    	if(freq[i]>1)
    		return false;
    }
    return true;
}
int main() {
	string str = "defaghij";
	if(allUniqueCharacters(str))
	    cout<<"yes, unique string";
	else 
	    cout<<"not unique string";
	allUniqueCharacters(str);
	return 0;
}