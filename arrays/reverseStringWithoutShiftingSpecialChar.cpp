#include <iostream>
using namespace std;

/**
 * 
 Given a string, that contains special character together with alphabets 
 (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string in a way that special characters 
 are not affected.

Examples:

Input:   str = "a,b$c"
Output:  str = "c,b$a"
Note that $ and , are not moved anywhere.  
Only subsequence "abc" is reversed
 
 */
bool isAlphabet(char ch) {
    if(ch>= 'A' && ch<='Z')
        return true;
    else if (ch>='a' && ch<='z')
        return true;
    else return false;  
} 
void reverseString(char *arr, int n){
    int l = 0, r = n;
    char flag;
    
    while(l<r){
        if(!isAlphabet(arr[l]))
            l++;
        else if (!isAlphabet(arr[r]))
            r--;
        else{
            flag = arr[l];
            arr[l] = arr[r];
            arr[r] = flag;
            l++;
            r--;
        }    
    }
    
    for(int i=0; arr[i]!='\0'; i++)
        cout<<arr[i];
} 
int main() {
	char arr[] = "ab$sdf,df";
	int n=8;
	reverseString(arr, 8);
	return 0;
}