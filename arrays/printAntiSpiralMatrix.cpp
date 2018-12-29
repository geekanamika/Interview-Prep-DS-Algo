/*
ARRAYS-SPIRAL PRINT ANTICLOCKWISE
Take as input a 2-d array. Print the 2-D array in spiral form anti-clockwise.


Input Format:
Two integers M(row) and N(colomn) and further M * N integers(2-d array numbers).

Constraints:
Both M and N are between 1 to 10.
Output Format:
All M * N integers seperated by commas with 'END' wriiten in the end(as shown in example).

Sample Input:
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
Sample Output:
11, 21, 31, 41, 42, 43, 44, 34, 24, 14, 13, 12, 22, 32, 33, 23, END

*/

#include <iostream>
using namespace std;

void printAntiClockSpiral(int arr[][11], int m, int n) {
    int lr = 0, rr=m-1, i;
    int lc=0, rc=n-1;
    while(lr<=rr && lc<=rc) {
        // left column print
        for(i= lr; i<=rr; i++) {
            cout<<arr[i][lc]<<", ";
        }
        lc++;
        // print bottom row
        for(i=lc; i<=rc; i++) {
            cout<<arr[rr][i]<<", ";
        }
        rr--;
        // print right column
        for(i=rr; i>=lr; i--) {
            cout<<arr[i][rc]<<", ";
        }
        rc--;
        // top riw print
        for(i= rc; i>=lc; i--) {
            cout<<arr[lr][i]<<", ";
        }
        lr++;        
    }
    cout<<"END";
}

int main() {
	int n,m;
    int arr[11][11];
    int t;
    cin>>m>>n;
    for(int i=0; i<m; i++) {
        for(int j=0; j<n; j++) {
            cin>>arr[i][j];
        }
    }

    printAntiClockSpiral(arr, m, n);
	    
	return 0;
}