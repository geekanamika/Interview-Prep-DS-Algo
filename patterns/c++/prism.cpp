#include <iostream>
using namespace std;
/*
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321
 12345654321
  123454321
   1234321
    12321
     121
      1

*/ 
void printPattern(int n) {
    
    int i, j,k,p;
    // print till first n-1 lines 
    for(i=1,k=(n-1); i<n; i++,k--) {
        for(j=k; j>=1; j--)  {
            cout<<" ";
        }
        for(j=(i-1), p=1; j>=1; p++, j--) {
            cout<<p;
        }
        cout<<i;
        p--;
        for(j=p; j>=1; j--) {
            cout<<j;
        }
        cout<<endl;
    }
    // mid line
    for(j=1; j<n;j++) {
        cout<<j;
    }
    for(;j>=1; j--) {
        cout<<j;
    }
    cout<<endl;
    // print till next n-1 lines 
    for(i=(n-1),k=1; i>=1; i--,k++) {
        // spaces
        for(j=1; j<=k; j++)  {
            cout<<" ";
        }
        // left side
        for(j=1; j<i; j++) {
            cout<<j;
        }
        // mid
        //cout<<j;
        //j--;
        for(; j>=1; j--) {
            cout<<j;
        }
        cout<<endl;
    }
    
}

int main() {
	int t;
	cin>>t;
	if(t>1)
	    printPattern(t);
	return 0;
}