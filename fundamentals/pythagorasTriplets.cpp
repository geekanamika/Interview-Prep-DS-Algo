#include <stdio.h>
#include<math.h>
#include<iostream>
using namespace std;
/*
PYTHAGORAS TRIPLET
Given n , print its Pythagoras pair in increasing order if they exist.
Otherwise print "-1".

Input Format:
n

Constraints:
n <= 10^9

Output Format
Pythagoras Pair, x y

Sample Input
3
Sample Output
4 5
*/

int main() {
	//code
	int n;
	cin>>n;
	int k, b , c;
	int bsq, csq, nsq;
	if(n%2!=0) {
	    k = (n-1)/2;
	    b = (2 * k * k)+ (2*k);
	    c = b+1;
	} else {
	    k = (n-2)/4;
	    c = (4*k*k) + n;
	    b = c-2;
	}
	csq = c*c;
	bsq = b*b;
	nsq = n*n;
	
	if(csq == (bsq+nsq) && k>=1) {
	    cout<<b << " "<< c;
	} else cout<<"-1";
	return 0;
}