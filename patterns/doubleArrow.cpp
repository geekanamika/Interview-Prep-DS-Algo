#include <iostream>
using namespace std;
/*
                            1 
                        2 1   1 2 
                    3 2 1       1 2 3 
                4 3 2 1           1 2 3 4 
                    3 2 1       1 2 3 
                        2 1   1 2 
                            1 


                            1 
                        2 1   1 2
                    3 2 1       1 2 3
                4 3 2 1           1 2 3 4
            5 4 3 2 1               1 2 3 4 5
        6 5 4 3 2 1                   1 2 3 4 5 6
            5 4 3 2 1               1 2 3 4 5
                4 3 2 1           1 2 3 4
                    3 2 1       1 2 3
                        2 1   1 2
                            1 

*/ 
void printPattern(int n) {
    
    int s1,s2,i,j,k;
    int len = n/2;
    for(i=1, s1=4*len,s2=-3; i<=(len+1); i++, s1-=4, s2+=4 ) {
        // front space
        for(j=s1; j>=1; j--) {
            cout<<" ";
        }
        // left half till mid line
        for(j=i; j>=1; j--) {
            cout<<j<<" ";
        }
        // mid spaces
        for(j=s2; j>=1; j--) {
            cout<<" ";
        }
        if(i>1) {
            for(j=1; j<=i; j++) {
                cout<<" "<<j;
            }
        }
        cout<<endl;
    }
    // rest half below mid
    s2-=8;
    for(i=len,k=1; i>=1; i--,k++,s2-=4) {
        for(j=1; j<=(4*k); j++) {
            cout<<" ";
        }
        // left half
        for(j=i; j>=1; j--) {
            cout<<j<<" ";
        }
        // mid space
        for(j=1; j<=s2; j++) {
            cout<<" ";
        }
        // right half
        if(i>1) {
            for(j=1; j<=i; j++) {
                cout<<" "<<j;
            }
        }
        cout<<endl;
    }
    
}

int main() {
	int t;
	cin>>t;
	if(t>=1 && t&1)
	    printPattern(t);
	return 0;
}