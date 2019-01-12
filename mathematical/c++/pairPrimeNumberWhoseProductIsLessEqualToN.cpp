/*
Print all pairs (sets) of prime numbers (p,q) such that p*q <= n, where n is given number.

Input:
The first line of input contains an integer T denoting the number of test cases. T testcases follow.
The first line of each test case is N.

Output:
For each testcase, in a new line, print the all pairs of prime numbers in increasing order.

Constraints:
1 ≤ T ≤ 50
4 ≤ N ≤ 400

Example:
Input:
2
4
8
Output:
2 2
2 2 2 3 3 2
*/
#include <iostream>
#include<math.h>
using namespace std;

bool checkPrimeOrNot(int n){
    int s = sqrt(n);
    for(int i=2; i<=s; i++) {
        if(n%i==0)
            return false;
    }
    return true;
}


void findPairs(int sq, int num) {
    int arr[100];
    int i=2, index=0;
    while(i<=sq) {
        if(checkPrimeOrNot(i)) {
            arr[index] = i;
            index++;
        }
        i++;
    }
    // for(int j=0; j<index; j++)
    //     cout<<arr[j]<<" ";
    
    for(int i=0; i<index; i++){
        for(int j=0; j<index; j++) {
            if(arr[i]*arr[j]<=num)
                cout<<arr[i]<<" "<<arr[j]<<" ";
        }
    }   
    cout<<endl;
}


int main() {
	int t, n;
	int sq;
	cin>>t;
	while(t--) {
	    cin>>n;
	    findPairs(n/2,n);
	}
	return 0;
}