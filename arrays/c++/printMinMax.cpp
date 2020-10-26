/*
Given an array A of size N of integers. Your task is to find the minimum and maximum elements in the array.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains 2 lines of input. The first line of each testcase contains the size of array N. The following line contains elements of the array separated by spaces.

Output:
For each testcase, print the minimum and maximum element of the array.

Constraints:
1 <= T <= 100
1 <= N <= 1000
1 <= Ai <=1012

Example:
Input:
2
6
3 2 1 56 10000 167
5
1 345 234 21 56789
Output:
1 10000
1 56789
*/

#include <iostream>
using namespace std;
void printMinMax(int *arr, int n)  {
    int min, max;
    if(n==1) {
        cout<<arr[0]<<" "<<arr[0]<<endl;
        return;
    }
        
    if(arr[0]>arr[1]) {
        max = arr[0];
        min = arr[1]; 
    } 
    else {
        max = arr[1];
        min = arr[0];
    }
    
    for(int i=2; i<n; i++) {
        if(arr[i]>max) {
            max = arr[i];
        } else if (arr[i]<min) {
            min  = arr[i];
        }
    }   
    cout<<min<<" "<<max<<endl;
}


int main() {
	int t, n;
	int arr[1000];
	cin>>t;
	while(t--) {
	    cin>>n;
	    for(int i=0; i<n; i++) {
	        cin>>arr[i];
	    }
	    printMinMax(arr, n);
	}
	return 0;
}
