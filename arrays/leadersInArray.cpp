/**
Leaders in an array
        
Given an array of positive integers. Your task is to find the leaders in the array.
Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader. 

Input:
The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N denoting the size of array.
The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Output:
Print all the leaders.

Constraints:
1 <= T <= 100
1 <= N <= 107
0 <= Ai <= 1018

Example:
Input:
3
6
16 17 4 3 5 2
5
1 2 3 4 0
5
7 4 5 7 3
Output:
17 5 2
4 0
7 7 3

Explanation:
Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements of right side of 7 (at index 3) are smaller than 7. And, the last element 3 is itself a leader since no elements are on its right.
*/

#include <iostream>
#include<vector>
using namespace std;

unsigned long long max(unsigned long long a, unsigned long long b) {
    return a>b? a : b;
}

void printLeadersInArray(vector<unsigned long long> arr, long n) {
    vector<unsigned long long> res(n,0);
    long j;
    // create greater to right array
    res[n-1] = arr[n-1];
    for(j=n-2; j>=0; j--) {
        res[j] = max(res[j+1], arr[j]);
    }
    
    for(j=0; j<n; j++) {
        if(arr[j] == res[j])
            cout<<arr[j]<<" ";
        //cout<<res[j]<<" ";
    }
    cout<<endl;
}

void printOptimizedLeadersInArray(vector<unsigned long long> arr, long n) {
    vector<unsigned long long> res;
    unsigned long long temp;
    long j;
    // create greater to right array
    temp = arr[n-1];
    res.push_back(temp);
    for(j=n-2; j>=0; j--) {
        temp = max(temp, arr[j]);
        if(arr[j] == temp) {
            res.push_back(temp);
        }
    }
    
    for(j=res.size()-1; j>=0; j--) {
        cout<<res[j]<<" ";
    }
    cout<<endl;
}

int main() {
	int t;
	long n;
	unsigned long long temp;
	cin>>t;
	while(t--) {
	    vector<unsigned long long> arr;
	    cin>>n;
	    for (int i=0; i<n; i++) {
	        cin>>temp;
	        arr.push_back(temp);
	    }
	    printLeadersInArray(arr, n);
	}
	return 0;
}