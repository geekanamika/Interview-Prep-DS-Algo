/*
Given an array A of positive integers of size N, where each value represents number of chocolates in a packet. Each packet can have variable number of chocolates. There are M students, the task is to distribute chocolate packets such that :
1. Each student gets one packet.
2. The difference between the number of chocolates given to the students having packet with maximum chocolates and student having packet with minimum chocolates is minimum.

Input:
The first line of input contains an integer T, denoting the number of test cases. Then T test cases follow. Each test case consists of three lines. The first line of each test case contains an integer N denoting the number of packets. Then next line contains N space separated values of the array A denoting the values of each packet. The third line of each test case contains an integer m denoting the no of students.

Output:
For each test case in a new line print the minimum difference.

Constraints:
1 <= T <= 100
1 <=N<= 107
1 <= Ai <= 1018
1 <= M <= N

Example:
Input:
2
8
3 4 1 9 56 7 9 12
5
7
7 3 2 4 9 12 56
3

Output:
6
2

Explanation:
Testcase 1: The minimum difference between maximum chocolates and minimum chocolates is 9-3=6
*/

#include <iostream>
#include<algorithm>
#include<limits.h>
using namespace std;

void swap(long *x, long *y) {
    long temp = *x;
    *x = *y;
    *y = temp;
}

int getDiffBetweenMaxMinDistribution(vector<long long> arr, long n, long m) {
        // sort array first
        sort(arr.begin(), arr.end());
        // Largest number of chocolates 
    int min_diff = INT_MAX; 
  
    // Find the subarray of size m such that 
    // difference between last (maximum in case 
    // of sorted) and first (minimum in case of 
    // sorted) elements of subarray is minimum. 
    int first = 0, last = 0; 
    for (int i=0; i+m-1<n; i++) 
    { 
        int diff = arr[i+m-1] - arr[i]; 
        if (diff < min_diff) 
        { 
            min_diff = diff; 
            first = i; 
            last = i + m - 1; 
        } 
    } 
    return (arr[last] - arr[first]); 
}

int main() {
	int t;
	long n, m,temp;
	vector<long long> arr;
	cin>>t;
	while(t--) {
	    vector<long long> arr;
	    cin>>n;
	    for(int i=0; i<n; i++) {
	         cin>>temp;
	         arr.push_back(temp);
	    }
	    cin>>m;
	    cout<<getDiffBetweenMaxMinDistribution(arr, n, m)<<endl;
	}
	return 0;
}