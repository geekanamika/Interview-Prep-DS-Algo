#include <iostream>
#include<vector>
using namespace std;
/*

1						1
1	2				2	1
1	2	3		3	2	1
1	2	3	4	3	2	1

 
*/ 
void printPattern(int n) {
    
    int i, j,k,t;
    for(i=1, k=2*(n-2); i<n; i++,k-=2) {
        for(j=1; j<=i; j++) {
            cout<<j<<"\t";
        }
        for(t=k; t>=1; t--) {
            cout<<"\t";
        }
        j--;
        for(; j>=1; j--) {
            cout<<"\t"<<j;
        }
        cout<<endl;
    }
    for(i=1;i<=n;i++) {
        cout<<i<<"\t";
    }
    for(j=(n-1); j>=1;j--)  {
        cout<<j<<"\t";
    }
}

int main() {
	int t;
	cin>>t;
	if(t>=1)
	    printPattern(t);
	return 0;
}