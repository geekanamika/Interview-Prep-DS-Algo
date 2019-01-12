/*
GCD of Array 
Given an array of N positive integers. Your task is to find the GCD of all numbers of the array.

Input:
First line of input contains number of test cases T. First line of test case contains a positive integer N, size of the array. Next line contains the array elements.

Output:
For each testcase, print the GCD of array elements.

Constraints:
1 <= T <= 100
1 <= N <= 10^6
1 <= Arr[i] <= 10^6

Example:
Input:
1
2
5 10

Output:
5
*/

#include <iostream>
#include<vector>
using namespace std;

long gcdOfNum(long a, long b) {
    if(b==0)    
        return 0;
    long flag = a%b;
    if(flag == 0)   // base case
        return b;
        
    return gcdOfNum(b, flag);    
}

int findGcdArray(vector<long> arr, long size) {
    long gcdArr = arr[0];
    for(long i=1; i<size; i++) {
        // gcd of current gcd & remaining arr[i] = gcd of Arr
        gcdArr = gcdOfNum(gcdArr, arr[i]);
        if(gcdArr == 0)    
            return 0;
    }
    return gcdArr;
}

int main() {
	int t;
	long n, temp, i;
	cin>>t;
	while(t--) {
	    cin>>n;
	    vector<long> arr;
	    for(i=0; i<n; i++) {
	        cin>>temp;
	        arr.push_back(temp);
	    }
	    cout<<findGcdArray(arr, n)<<endl;
	}
	return 0;
}