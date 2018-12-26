/*
Sum of all prime numbers between 1 and N
        
Given a positive integer N, calculate the sum of all prime numbers between 1 and N(inclusive).

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow. Each testcase contains one line of input containing N.

Output:
For each testcase, in a new line, print the sum of all prime numbers between 1 and N.

Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 106

Example:
Input:
2
5
10
Output:
10
17
*/

#include <iostream>
#include<vector>
using namespace std;

long findSumOfPrimeNum(long n) {
    vector<int> arr(n+1, 0);
    if(n==1)
        return 0;
    long p = 2, sq = 4;
    unsigned long sum=0;
    while(sq<=n) {
        // mark all sq, sq+p, sq+2p, ... as 1
        while(sq<=n) {
            arr[sq] = 1;
            sq +=p;
        }
        p++;
        // find next unmarked and update p, sq
        while(p<=n) {
            if(arr[p] == 0)
                break;
            p++;    
        }
        sq = p*p;
    }
    
    for(p=2; p<=n; p++) {
        if(arr[p] == 0) {
            //cout<<p<<" ";
            sum+=p;
        }
    }
    //cout<<endl;
    return sum;
}

int main() {
	int t;
	long n;
	cin>>t;
	while(t--) {
	    cin>>n;
	    cout<<findSumOfPrimeNum(n)<<endl;
	}
	return 0;
}