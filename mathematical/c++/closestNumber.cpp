/*
Given two integers N and M. The problem is to find the number closest to N and divisible by M. If there are more than one such number, then output the one having maximum absolute value.

Input:
The first line consists of an integer T i.e number of test cases. T testcases follow.  The first and only line of each test case contains two space separated integers N and M.

Output:
For each testcase, in a new line, print the closest number to N which is also divisible by M.

Constraints: 
1 <= T <= 100
-1000 <= N, M <= 1000

Example:
Input:
2
13 4
-15 6
Output:
12
-18
*/

#include <iostream>
using namespace std;
int closestNumber(int n, int m) {
    int n1, n2, diff1, diff2, flag=0;
    if(n<0) {
	    n = n*-1;
	    flag = 1;
	} else if (m<0){
	    m = m*-1;
	    flag =2;
	}
	    
	n1 = m * (n/m);
	n2 = m * ((n/m)+1);
	diff1 = n-n1;
	diff2 = n2-n;
	if(diff1==diff2) {
	    if(flag==1 || flag==2)
	        return -1*(n2);
	    else 
	        return n2;
	} else if (diff1<diff2) {
	    if(flag==1)
	        return -1*(n1);
	    else 
	        return n1;
	} else {
	    if(flag==1)
	        return -1*(n2);
	    else 
	        return n2;
	}
}
int main() { 
	int n, m, t;
	cin>>t;
	while(t--) {
	    cin>>n>>m;
	    cout<<closestNumber(n, m)<<endl;
	
	}
	return 0;
	
}