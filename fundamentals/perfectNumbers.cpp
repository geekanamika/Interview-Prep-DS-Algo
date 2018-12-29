/*
Perfect Numbers
        
Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Input:
First line consists of T test cases. Then T test cases follow .Each test case consists of a number N.

Output:
For each testcase, in a new line, output in a single line 1 if a number is a perfect number else print 0.

Constraints:
1 <= T <= 300
1 <= N <= 104

Example:
Input:
2
6
21
Output:
1
0
*/

#include <iostream>
#include<math.h>
using namespace std;

// O(sqrt(n)) complexity

void checkIfPerfectOrNot(int num) {
    int i;
    int sum=1;
    for(i=2; i<=sqrt(num); i++) {
        if(num%i==0) {
            if(i*i != num){
               sum = sum + i + (num/i); 
            } else {
                sum = sum + i;
            }
        }
    }
    if(sum == num) {
        cout<<"1"<<endl;
    } 
    else 
        cout<<"0"<<endl;
}

int main() {
	int t;
	int n;
	cin>>t;
	while(t--) {
	    cin>>n;
	    checkIfPerfectOrNot(n);
	}
	return 0;
}