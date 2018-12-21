/*
Given an array A of size N, print the reverse of it.

Input:
First line contains an integer denoting the test cases 'T'. T testcases follow. Each testcase contains two lines of input. First line contains N the size of the array A. The second line contains the elements of the array.

Output:
For each testcase, in a new line, print the array in reverse order.

Constraints:
1 <= T <= 100
1 <= N <=100
0 <= Ai <= 100

Example:
Input:
1
4
1 2 3 4
Output:
4 3 2 1
*/

#include <iostream>
#include<vector>
using namespace std;

int main() {
    int t, n, temp;
    vector<int> a;
	cin>>t;
	while(t--) {
	    cin>>n;
	    for(int i=0; i<n; i++) {
	        cin>>temp;
	        a.push_back(temp);
	    }
    	    // print reverse
    	for(int i=a.size()-1; i>=0; i--)
    	    cout<<a[i]<<" ";
    	cout<<endl;   
    	a.clear();
	}
	
	 
	return 0;
}