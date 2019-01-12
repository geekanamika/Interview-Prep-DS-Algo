#include <iostream>
using namespace std;
/*

1
2 2
3 0 3
4 0 0 4
5 0 0 0 5

*/ 
void printPattern(int n) {
    
    int i, j,k;
    // print till first n lines 
    for(i=1,k=-1; i<=n; i++,k++) {
        cout<<i<<"\t";
        for(j=k;j>=1;j--) {
            cout<<"0\t";
        }
        if(i>1)
            cout<<i;
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