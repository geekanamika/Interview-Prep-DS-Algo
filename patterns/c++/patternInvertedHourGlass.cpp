
/**
PATTERN INVERTEDHOURGLASS
Take N as input. For a value of N=5, we wish to draw the following pattern :

             5                   5 
             5 4               4 5 
             5 4 3           3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2 1 0 1 2 3 4 5 
             5 4 3 2 1   1 2 3 4 5 
             5 4 3 2       2 3 4 5 
             5 4 3           3 4 5 
             5 4               4 5 
             5                   5 

Input Format:
Take N as input.

Output Format:
Pattern should be printed with a space between every two values.

Sample Input:
5
Sample Output:
5                   5 
5 4               4 5 
5 4 3           3 4 5 
5 4 3 2       2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2 1 0 1 2 3 4 5 
5 4 3 2 1   1 2 3 4 5 
5 4 3 2       2 3 4 5 
5 4 3           3 4 5 
5 4               4 5 
5                   5 
*/

#include <iostream>
#include<vector>
using namespace std;

void printPattern(int n) {
    
    int i, j, k, m, s;
    s = 1 + ((n-1)*4);
    // outer loop to track of first n rows
    for(i=1; i<=n; i++, s-=4) {
        k = n+1;
        // prints digits left
        for(j=0; j<i; j++) {
            --k;
            cout<<k<<" ";
        }
        // spaces
        for(m=1; m<=s; m++) {
            cout<<" ";
        }
        // prints digits right
        for(m=k; m<=n; m++) {
            cout<<" "<<m;
        }
        cout<<endl;
    }
    // mid line
    k = n;
    while(k) {
        cout<<k<<" ";
        k--;
    }
    cout<<"0";
    ++k;
    while(k<=n) {
        cout<<" "<<k;
        k++;
    }
    cout<<endl;
    // outer loop to track of next n rows
    s =1;
    
    for(i=n; i>=1; i--, s+=4) {
        k = n+1;
        // prints digits left
        for(j=0; j<i; j++) {
            --k;
            cout<<k<<" ";
        }
        // spaces
        for(m=1; m<=s; m++) {
            cout<<" ";
        }
        // prints digits right
        for(m=k; m<=n; m++) {
            cout<<" "<<m;
        }
        cout<<endl;
    }
    
}

int main() {
	int t;
	cin>>t;
	printPattern(t);
	return 0;
}