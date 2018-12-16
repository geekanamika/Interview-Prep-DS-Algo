#include <stdio.h>
#include<iostream>
#include<cstring>
using namespace std;
bool checkPermutationOrNot(string s1, string s2) {
    // frequency char array which stores frequency of every character
    int cs[26]= {0};
    int i;
    
    // stores s1's character's frequency
    for(i=0; i<s1.length(); i++) {
        cs[s1[i]-'a']++;
    }
    
    // minus whenever any char matches with s1's frequency
    for(i=0; i<s2.length(); i++) {
        cs[s2[i]-'a']--;
    }
    i=0;
    // if at end, full array is again only 0, hence number of all character were equal
    // hence they were permutation of each other
    while(i<26) {
        if(cs[i]!=0)
            return false;
        i++;    
    }
    return true;
}
int main() {
	string s1 = "hello";
	string s2 = "hello";
	
	cout<<checkPermutationOrNot(s1, s2);
	return 0;
}