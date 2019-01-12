/**
Sieve of Eratosthenes
         
Given a number N, calculate the prime numbers upto N using Sieve of Eratosthenes.  

Input: 
The first line of the input contains T denoting the number of testcases. T testcases follow. Each testcase contains one line of input containing N.

Output: 
For all testcases, in a new line, print all the prime numbers upto or equal to N.

Constraints:
1 <= T<= 100
1 <= N <= 104

Example:
Input:
2
10
35
Output:
2 3 5 7
2 3 5 7 11 13 17 19 23 29 31 
*/

#include <iostream>
#include<vector>
using namespace std;

void printSOE(int n) {
    // create array of n size with 0 as initial value
    vector<int> arr(n+1,0);
    int i;
    int p=2;
    int sq=4;
    // starting from p^2 mark all those number who are 
    // increments of p with p^2 
    // ex: p^2, p(p+1), p(p+2), p(p+3) till n
    while(sq<=n) {
        
        // mark them 1
        while(sq <=n) {
            arr[sq] = 1;
            sq+=p;
        }
        p++;
        // next unmarked number as p & update p, sq
        while(p<=n){
            // find unmarked
            if(arr[p]==0)
                break;
            p++;    
        }
        sq = p*p;
    }
    // print arr from i=2 to n if arr[i] ==0
    for(p=2; p<=n; p++) {
        if(arr[p] == 0)
            cout<<p<<" ";
    }
    cout<<endl;
}

int main() {
	int t, n;
	cin>>t;
	while(t--) {
	    cin>>n;
	    printSOE(n);
	}
	return 0;
}