/**
卐 GANESHA'S PATTERN
Take as input N, an odd number (>=5) . Print the following pattern as given below for N = 7.

*  ****
*  *
*  *
*******
   *  *
   *  *
****  *

Input Format:
Enter value of N ( >=5 )

Constraints:
N >= 5
Sample Input:
7
Sample Output:
*  ****
*  *
*  *
*******
   *  *
   *  *
****  *

*/

#include <iostream>
#include<vector>
using namespace std;

void printPattern(int n) {
    // first line
    int i,j;
    cout<<"*";
    for(j=1; j<(n/2); j++) {
        cout<<" ";
    }
    while(j<n) {
        cout<<"*";
        j++;
    }
    cout<<endl;
    // lines before mid lines
    for(int i=1; i<(n/2); i++) {
        cout<<"*";
        for(j=1; j<(n/2); j++) {
            cout<<" ";
        }
        cout<<"*";
        cout<<endl;
    }
    // mid line
    for(j=0; j<n; j++) {
        cout<<"*";
    }
    cout<<endl;
    // lines after mid line & before end line
    for(int i=(n/2)+1; i<(n-1); i++) {
        for(j=0; j<(n/2); j++) {
            cout<<" ";
        }
        cout<<"*";
        for(j=(n/2)+1; j<(n-1); j++) {
            cout<<" ";
        }
        cout<<"*";
        cout<<endl;
    }
    // last line
    for(j=0; j<=(n/2); j++) {
        cout<<"*";
    }
    while(j<(n-1)) {
        cout<<" ";
        j++;
    }
    cout<<"*";
}

int main() {
	int t;
	cin>>t;
	printPattern(t);
	return 0;
}