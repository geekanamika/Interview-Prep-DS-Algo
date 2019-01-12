/*
Ups and Downs
Given an array A of N integers. The task is to count Ups and Downs formed in the array.
Up: A point which is at higher than its neighbours.
Down: A point which is deeper than its neighbours.

Input:
First line of input contains number of testcases T. For each testcase, there will be two lines, first of which contains N, size of array and next line contains N integers.

Output:
Print the number of Ups and Downs respectively seperated by space.

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= A[i] <= 106

Example:
Input:
1
9
1 2 3 4 5 6 5 8 2

Output:
2 1
*/

#include<vector>
using namespace std;

int main() {
	int t;
	long n, temp;
	int ups , downs;
	cin>>t;
	while(t--) {
	    cin>>n;
	    ups=0;
	    downs=0;
	    vector<long> arr;
	    for(int i=0; i<n; i++) {
	       cin>>temp;
	       arr.push_back(temp);
	    }
	    
	    for(int i=1 ; i<n-1 ; i++) {
	        if(arr[i-1]>arr[i] && arr[i+1] > arr[i])
	            downs++;
	        else if (arr[i-1]<arr[i] && arr[i+1] < arr[i])     
	            ups++;
	    }
	    cout<<ups<<" "<<downs<<endl;
	}
	
	return 0;
}