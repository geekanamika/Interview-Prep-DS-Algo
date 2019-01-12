// 1) Sort arr1[] and arr2[]. This step takes O(mLogm + nLogn) time.
//2) Use O(m + n) algorithms to find union and intersection of two sorted arrays.

//Overall time complexity of this method is O(mLogm + nLogn).

/**
Intersection of two arrays Submissions: 5669   Accuracy: 26.54%   Difficulty: Basic   Marks: 1
            
Given two arrays with distinct elements A and B, print intersection (or common elements) of the two arrays.  If no element is common in two arrays, then print Zero.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and M,N is the size of array A and M is size of array B.
The second line of each test case contains N input A[i].
The third line of each test case contains M input B[i].

Output:

Print the intersecting elements sorted in ascending order .If no element is common in two array, then print "Zero" without quotes.

Constraints:

1 ≤ T ≤ 50
1 ≤ N, M ≤ 100
1 ≤ A[i], B[i] ≤ 1000

Example:

Input:2
5 3
89 24 75 11 23
89 2 4
6 5
1 2 3 4 5 6
3 4 5 6 7

Output:
89
3 4 5 6
*/


#include <iostream>
#include<algorithm>
using namespace std;

void printIntersectionOfArrays(int *a, int *b, int m, int n) {
    int i=0, j=0;
    bool flag = false;
    // sort both arrays
    sort(a, a+m);
    sort(b, b+n);
    // print till both have common length available
    while(i<m && j<n) {
        if(a[i]<b[j]) {
            //cout<<a[i]<<" ";
            i++;
        } else if (a[i]>b[j]) {
            //cout<<b[j]<<" ";
            j++;
        } else {
            cout<<a[i]<<" ";
            i++;
            j++;
            flag = true;
        }
    }
    if(!flag)
        cout<<"Zero";
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
	    printIntersectionOfArrays(arr1, arr2, m, n);
	}
	return 0;
}