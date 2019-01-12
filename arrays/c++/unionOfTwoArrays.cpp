// 1) Sort arr1[] and arr2[]. This step takes O(mLogm + nLogn) time.
//2) Use O(m + n) algorithms to find union and intersection of two sorted arrays.

//Overall time complexity of this method is O(mLogm + nLogn).


/**
Union of two arrays 
        
Given two arrays A and B, find union between these two array.  If there are repetitions, then only one occurrence of element should be printed in union.

Input:

The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consist of three lines.
The first line of each test case contains two space separated integers N and M, where N is the size of array A and M is the size of array B.
The second line of each test case contains N space separated integers denoting elements of array A.
The third line of each test case contains M space separated integers denoting elements of array B.

Output:

Correspoding to each test case, print in a new line, the union of the two arrays in sorted order.

Constraints:

1 ≤ T ≤ 30
1 ≤ N, M ≤ 1000
1 ≤ A[i], B[i] < 1000

Example:

Input:
2
5 3
1 2 3 4 5
1 2 3
6 2
85 25 1 32 54 6
85 2

Output:
1 2 3 4 5
1 2 6 25 32 54 85
*/

#include <iostream>
#include<algorithm>
using namespace std;

void printUnionOfArrays(int *a, int *b, int m, int n) {
    int i=0, j=0;
    // sort both arrays
    sort(a, a+m);
    sort(b, b+n);
    // print till both have common length available
    while(i<m && j<n) {
        if(a[i]<b[j]) {
            cout<<a[i]<<" ";
            i++;
        } else if (a[i]>b[j]) {
            cout<<b[j]<<" ";
            j++;
        } else {
            cout<<a[i]<<" ";
            i++;
            j++;
        }
    }
    // print rest of the array
    while(i<m) {
        cout<<a[i]<<" ";
        i++;
    }
    while(j<n) {
        cout<<b[j]<<" ";
        j++;
    }
    cout<<endl;
}
int main() {
	int t, m,n;
	int arr1[1001], arr2[1001];
	cin>>t;
	while(t--) {
	    cin>>m>>n;
	    for(int i=0; i<m; i++) {
	        cin>>arr1[i];
	    }
	    for(int i=0; i<n; i++) {
	        cin>>arr2[i];
	    }
	    printUnionOfArrays(arr1, arr2, m, n);
	}
	return 0;
}