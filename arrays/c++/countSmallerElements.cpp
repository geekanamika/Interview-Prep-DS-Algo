/*
Count Smaller elements
Given an array A of positive integers. Count number of smaller elements on right side of each array.

Input:
The first line of input contains an integer T denoting the number of test cases. The first line of each test case is N,N is the size of array. The second line of each test case contains N input arr[i].

Output:
Print the countSmaller array.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106
1 <= Ai  <= 108

Example:
Input:
2
7
12 1 2 3 0 11 4
5
1 2 3 4 5

Output:
6 1 1 1 0 1 0
0 0 0 0 0

Explanation:
Testcase 1: 6 elements are greater than 1 on its right side in original array. Similarly 1 element is greater than 4 on its right side in original array.
*/

#include <iostream>
#include<algorithm>
using namespace std;
/**
can be solved in nLogn using self - balancing trees
	read later*/
void countSmaller(long *arr, long *unsortedArr, long n) {
   
   int pos,j;
   for (int i=0; i<n; i++) {
       pos = 0;
       for(j=i+1; j<n; j++) {
           if(arr[j]<arr[i])
                pos++;
       }
       cout<<pos<<" ";
   }
   cout<<endl;
}

int main() {
	int t;
	long n;
	long arr[100000];
	cin>>t;
	int temp;
	while(t--) {
	    cin>>n;
	    for (int i=0; i<n; i++) {
	        cin>>arr[i];
	    }
	    countSmaller(arr,arr, n);
	   
	}
	return 0;
}