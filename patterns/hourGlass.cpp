#include <iostream>
#include<vector>
using namespace std;
/*
                 5 4 3 2 1 0 1 2 3 4 5
                   4 3 2 1 0 1 2 3 4 
                     3 2 1 0 1 2 3 
                       2 1 0 1 2 
                         1 0 1 
                           0 
                         1 0 1 
                       2 1 0 1 2 
                     3 2 1 0 1 2 3 
                   4 3 2 1 0 1 2 3 4 
                 5 4 3 2 1 0 1 2 3 4 5
*/
void printPattern(int n) {
    
    int i, j, k, m, s=0;
    // print till first n lines 
    for(i=0; i<n; i++, s+=2) {
        // left half
        for(k=0; k<s; k++) {
            cout<<" ";
        }
        for(k=(n-i); k>=1; k--) {
            cout<<k<<" ";
        }
        // mid zero
        cout<<"0";
        for(k=1; k<= (n-i); k++) {
            cout<<" "<<k;
        }
        cout<<endl;
    }
    // mid zero after n lines
    for(k=s; k>0; k--) {
        cout<<" ";
    }
    cout<<"0"<<endl;
    
    
    // print till next n lines 
    s-=2;
    for(i=1; i<=n; i++, s-=2) {
        // left half
        for(k=0; k<s; k++) {
            cout<<" ";
        }
        for(k=i; k>=1; k--) {
            cout<<k<<" ";
        }
        // mid zero
        cout<<"0";
        for(k=1; k<=i; k++) {
            cout<<" "<<k;
        }
        cout<<endl;
    }
}

int main() {
	int t;
	cin>>t;
	if(t<=1000 && t>=1)
	    printPattern(t);
	return 0;
}