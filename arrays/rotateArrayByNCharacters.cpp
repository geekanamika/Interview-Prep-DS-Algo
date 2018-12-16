#include <iostream>
#include<cstring>
#include<algorithm>
using namespace std;

void rotateStringArrayByN(string& str, int n){
    int len = str.length();
    int i=len-1;
    
    // leave n begining characters untouched, copy the whole string backwards
    // for example, if "anamika" is string, this loop will result in "anaanamika"
    while(i>=0) {
        str[i+n] = str[i];
        i--;
    }
    // now, take last n characters and copy in front
    // for ex, for "anaanamika", it will be "ikaanamika"
    for(i=0; i<n; i++)
        str[i] = str[len+i]; 
    // add null character to len position so that extra "n" characters are removed.
    // for ex: ikaanamika will change to "ikaanamika\0"
    str[len] = '\0';    
}

int main() {

    string s1 = "anamika tripathi";
    int n=3;
    
    rotateStringArrayByN(s1, n);
    cout<<s1<<endl;
    
	//code
	return 0;
}