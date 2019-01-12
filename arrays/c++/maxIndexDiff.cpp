/**
Maximum Index Submissions: 49209   Accuracy: 31.25%   Difficulty: Medium   Marks: 4
            
Given an array A of positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].

Input:
The first line contains an integer T, depicting total number of test cases.  Then following T lines contains an integer N depicting the size of array and next line followed by the value of array.

Output:
Print the maximum difference of the indexes i and j in a separtate line.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 107
0 ≤ A[i] ≤ 10^18

Example:
Input:
1
9
34 8 10 3 2 80 30 33 1

Output:
6

Explanation:
Testcase 1:  In the given array A[1] < A[7] satisfying the required condition(A[i] <= A[j]) thus giving the maximum difference of j - i which is 6(7-1).
*/

#include <iostream>
#include<vector>
using namespace std;

long max(long a, long b) {
    return a > b ? a:b;
}

long min(long a, long b) {
    return a < b ? a:b;
}

long maxMinDiff(vector<unsigned long long> arr, int n) {
    // create lMin & rMax arrays
    vector<unsigned long long> lMin(n, 0);
    long i, j;
    lMin[0] = arr[0];
    for(i=1; i<n; i++) {
        lMin[i] = min(arr[i], lMin[i-1]);
    }
    // max array
    vector<unsigned long long> rMax(n, 0);
    rMax[n-1] = arr[n-1];
    for(i=n-2; i>=0; i--) {
        rMax[i] = max(arr[i], rMax[i+1]);
    }
    
    // traverse & find max diff
    long maxDiff = 0;
    i = 0, j=0;
    while(j<n && i<n) {
        if(lMin[i]<=rMax[j]) {
            maxDiff = max(maxDiff, j-i);
            j++;
        } else {
          i++; 
        }
    }
    return maxDiff;
}

int main() {
	int t;
	long n;
	unsigned long long temp;
	cin>>t;
	while(t--) {
	    cin>>n;
	    vector<unsigned long long> arr;
	    for(int i=0; i<n; i++) {
	        cin>>temp;
	        arr.push_back(temp);
	    }
	    cout<<maxMinDiff(arr,n)<<endl;
	}
	return 0;
}