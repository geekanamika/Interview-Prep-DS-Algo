/**
Sum of distinct elements Submissions: 3523   Accuracy: 57.13%   Difficulty: Basic   Marks: 1
        
You are given an array of size N. Find the sum of distinct elements in an array.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains two lines of input:
The first line is N, the size of array.
The second line contains N elements separated by spaces.

Output:
For each testcase, print the sum of all distinct elements.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
0 ≤ A[i] ≤ 103

Example:
Input:
3
5
1 2 3 4 5
5
5 5 5 5 5
4
22 33 22 33
Output:
15
5
55
*/

#include <iostream>
#include<vector>
#include<algorithm>
#include<bits/stdc++.h>
using namespace std;

// Time: O(n) & Space: O(n)
void printSumOfDistinctElements(vector<int> arr, long n) {
    long i;
    unsigned long long sum = 0;
    unordered_set<int> dis;
    // count occurence of all elements
    for(i=0; i<n; i++) {
            if(dis.find(arr[i]) == dis.end()) {
                sum+=arr[i];
                dis.insert(arr[i]);
            }
    } 
    cout<<sum<<endl;
}

int main() {
    int t, temp;
    long n;
    cin>>t;
    while(t--) {
        cin>>n;
        vector<int> arr(n+1,0);
        for(int i=0; i<n; i++) {
            cin>>arr[i];
        }
        printSumOfDistinctElements(arr, n);
    }
    return 0;
}