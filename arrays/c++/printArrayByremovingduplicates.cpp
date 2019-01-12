/*
Remove duplicates from unsorted array
Given an array of integers which may or may not contain duplicate elements. Your task is to print the array after removing duplicate elements, if present.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains an integer n denoting the size of the array. Then following line contains 'n' integers forming the array.

Output: 
Output the array with no duplicate element present, in the same order as input.

Constraints:
1<=T<=100
1<=n<=100
1<=a[i]<=100

Example:
Input:
1
6
1 2 3 1 4 2
Output: 
1 2 3 4
*/

#include <iostream>
using namespace std;

bool searchFunction(int *arr, int pos) {
    for(int i=0; i<pos; i++) {
        if(arr[i] == arr[pos])
            return true;
    }
    return false;
}
int main() {
	int t, n;
	int arr[100];
	cin>>t;
	while(t--) {
	    cin>>n;
	    // input array
	    for(int i=0; i<n; i++)
	        cin>>arr[i];
	    cout<<arr[0];  
	    // only output arr[i] if it is not found in 0 to i-1
	    for(int i=1; i<n; i++){
	        if(!searchFunction(arr, i))
	            cout<<" "<<arr[i];
	    } 
	    cout<<endl;
	}
	return 0;
}