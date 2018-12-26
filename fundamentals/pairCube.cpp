/*
Pair cube count
        
Given N, count all ‘a’(>=1) and ‘b’(>=0) that satisfy the condition a3 + b3 = N.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case contains integer N.

Output:
For each testcase, in a new line, print count of all 'a' and 'b' that satisfy the above equation.

Constraints:
1 <= T <= 100
a>=1, b>=0
1 <= N <= 105

Example:
Input:
2
9
28

Output:
2
2
*/

#include<iostream>
#include<math.h>
using namespace std;

unsigned long long cube(int n) {
    return n*n*n;
}

int checkPairCube(int n) {
    int range = ceil(cbrt(n));
    unsigned long long flag;
    int count =0;
    for(int b=0; b<=n; b++) {
        for(int a=n; a>=1; a--) {
            flag = cube(a)+cube(b);
            if(flag == n) {
                count++;
                //cout<<a<<" "<<b<<endl;
            } else if (flag < n)
                break;
        }
    }
    return count;
}

int main() {
	int t, n;
	cin>>t;
	while(t--) {
	    cin>>n;
	    cout<<checkPairCube(n)<<endl;
	}
	return 0;
}