/*
Given an array of size N, rotate it by D elements. 

Input: 
The first line of the input contains T denoting the number of testcases. First line of test case is the number of elements N, next line contains D. Subsequent line will be the array elements.

Output: 
For each testcase, in a new line, output the rotated array.

Constraints:
1 <= T <= 200
1 <= N <= 107
1 <= D <= N
1 <= arr[i] <= 103

Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2
*/

#include <iostream>
#include<cstring>
#include<algorithm>
using namespace std;

void rotateArrayByN(int *arr, int n, int d){
    int j=0;
    while(j<d) {
        arr[n+j] = arr[j];
        j++;
    }
    j=0;
    while(j<n) {
        cout<<arr[d+j]<<" ";
        j++;
    }
    cout<<endl;
    
}

int main() {
    int t, n, d;
    int arr[100000];
    cin>>t;
    while(t--) {
        cin>>n;
        cin>>d;
        for (int i=0; i<n; i++) {
            cin>>arr[i];
        }
        
        rotateArrayByN(arr, n, d);
    }
	//code
	return 0;
}