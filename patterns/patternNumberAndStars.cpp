#include <iostream>
#include<vector>
using namespace std;
/*

 1******
 12*****
 123****
 1234***
 12345**
 123456*
 1234567
 
*/ 
void printPattern(int n) {
    
    int i, j;
    // print till first n lines 
    for(i=1; i<=n; i++) {
        for(j=1;j<=i;j++) {
            cout<<j;
        }
        for(;j<=n;j++) {
            cout<<"*";
        }
        cout<<endl;
    }
}

int main() {
	int t;
	cin>>t;
	if(t>=1)
	    printPattern(t);
	return 0;
}