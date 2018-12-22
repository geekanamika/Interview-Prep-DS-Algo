/*
Majority element
Given an array A of N elements. Find the majority element in the array. A majority element in an array A of size N is an element that appears more than N/2 times.

Input:  
The first line of the input contains T denoting the number of testcases. The first line of the test case will be the size of array and second line will be the elements of the array.

Output: For each test case the output will be the majority element of the array.

Constraints:
1 <= T<= 100
1 <= N <= 103
0 <= Ai <= 103

Example:
Input:
2
5
3 1 3 3 2
3
1 2 3

Output:
3
-1


*/

#include <iostream>
#include<algorithm>
#include<vector>
#include<limits.h>
using namespace std;


int main() {
	int t, n, temp,max;
	cin>>t;
	
	while(t--) {
	    int arr[1000]={0};
	    cin>>n;
	    for(int i=0; i<n; i++) {
	        cin>>temp;
	        // increase value at temp'th position
	        arr[temp]++;
	    }
	    // find max position in array
	    max=0;
	    for(int i=1; i<n; i++) {
	        if(arr[i]>arr[max])
	            max = i;
	    }
	    if(arr[max]>n/2)
	        cout<<max<<endl;
	    else cout<<"-1"<<endl;     
	}
	return 0;
}