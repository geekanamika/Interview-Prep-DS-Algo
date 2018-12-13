#include <stdio.h>
#include <iostream>

using namespace std;

bool isPermutation(char *s1, char *s2) {
    // freq array stores frequency of characters in string
    // for ex: in anamika - a=3, n=1, m=1, i=1, k=1
    int freq[26] = {0}, i=0;
    int flag=1;
    // stores frequency of s1 in freq array
    while(s1[i]!='\0') {
        freq[s1[i]-'a']++;
        i++;
    }
    // negate freqency occuring 
    // for ex: if char is 'a', then -- to that index so that at the end, we get 0 array
    // if strings are Permutation of each other
    i = 0;
    while(s2[i]!='\0') {
        freq[s2[i]-'a']--;
        i++;
    }
    
    // check if array is 0 or not
    i=0;
    while(i<26) {
        if(freq[i]!=0){
            flag = 0;
            break;
        }
        i++;
    }
    // checks final by flag's value due to above if-else condition
    if(flag == 1){
        return true;
    } else{
        return false;
    }
    
}
int main() {
	char str1[100], str2[100];
    cin.getline(str1, 99);
    cin.getline(str2, 99);
    
    cout<<isPermutation(str1, str2);
    return 0;
}