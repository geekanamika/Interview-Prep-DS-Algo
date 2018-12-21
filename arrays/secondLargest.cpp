/*
Given an array A of size N, print second largest element from an array.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input. The first line contains an integer N denoting the size of the array. The second line contains the N space seperated intgers of the array

Output:
For each testcase, in a new line, print the second largest element.

Constraints:
1 ≤ T ≤ 50
1 ≤ N ≤ 500
1 ≤ Ai ≤ 1200

Example:
Input
2
5
89 24 75 11 23
6
56 42 21 23 65 20
Output
75
56
*/


#include<iostream>
using namespace std;

int printSecondLargest(int *arr, int n) {
    int first, sec;
    if(arr[0]>arr[1]) {
        first = arr[0];
        sec = arr[1]; 
    } else {
        first = arr[1];
        sec = arr[0];
    }
    for(int i=2; i<n; i++) {
        if(arr[i]>first) {
            sec = first;
            first = arr[i];
        } else if (arr[i]<first && arr[i]>sec) {
            sec  = arr[i];
        }
    }
    return sec;
}
int main() {
	int t, n;
	int arr[500];
	cin>>t;
	while(t--) {
	    cin>>n;
	    for(int i=0; i<n; i++) {
	        cin>>arr[i];
	    }
	    cout<<printSecondLargest(arr, n)<<endl;
	}
	return 0;
}