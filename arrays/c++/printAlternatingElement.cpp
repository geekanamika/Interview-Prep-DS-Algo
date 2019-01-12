/*
Alternating elements
Given two arrays A and B of size N and M. The task is to print the array elements of A and B alternatively, i.e, A[i], B[i], A[i+1], B[i+1] ... .

Input: First line of input contains number of testcases T. For each testcase, there will be three lines, first of which contains N and M and next two line contains N and M integers respectively.

Output: For each testcase, print the array elements as required.

Constraints:
1 <= T <= 100
1 <= N, M <= 104
1 <= A[i], B[i] <= 106

Example:
Input:
1
2 3
1 3
2 4 5

Output:
1 2 3 4 5

Explanation:
Testcase 1: Elements are printed as A[0], B[0], A[1], B[1], B[2].
*/

#include<iostream>
#include<vector>

using namespace std;

void printVectors(vector<long>a , vector<long> b, int n, int m) {
    int i =0 , j=0, ch=0;
    while(i<n && j<m) {
	        if(ch%2==0){
	            cout<<a[i]<<" ";
	            ch++;
	            i++;
	        } else {
	            cout<<b[j]<<" ";
	            ch++;
	            j++;
	        }
	    }
	    
	    while(i<n) {
	        cout<<a[i]<<" ";
	        i++;
	    }
	    
	    while(j<m) {
	        cout<<b[j]<<" ";
	        j++;
	    }
	    
	    cout<<endl;
	    
}

int main() {
	int t, n , m, i, j, ch;
	long temp;
	cin>>t;
	while(t--) {
	    cin>>n>>m;
	    vector<long> a;
	    vector<long> b;
	    // cin a
	    for(i=0; i<n; i++) {
	        cin>>temp;
	        a.push_back(temp);
	    }
	    // cin b
	    for(i=0; i<m; i++) {
	        cin>>temp;
	        b.push_back(temp);
	    }
	    
	    printVectors(a, b, n , m);
	    
	}
	return 0;
}