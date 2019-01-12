// reverse an array
#include <iostream>
#include<cstring>
#include<algorithm>
using namespace std;

/**
    using loop
**/    
void reverseStringStl(string& str, int n){
    int mid = (n-1)/2;
    for(int i=0; i<=mid; i++){
        swap(str[i], str[n-i-1]);
    }
}

int main() {

    string s1 = "anamika tripathi";
    int len = s1.length();
    
    reverseStringStl(s1, len);
    cout<<s1<<endl;
    /**
        using internal function
    **/
    reverse(s1.begin(), s1.end());
    cout<<s1;
	//code
	return 0;
}