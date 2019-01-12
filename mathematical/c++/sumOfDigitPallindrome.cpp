/*
Sum of Digit is Pallindrome or not 
     
Write a program to check if the sum of digits of a given number N is a palindrome number or not.

Input:
The first line of the input contains T denoting the number of testcases. T testcases follow. Then each of the T lines contains single positive integer N denoting the value of number.

Output:
For each testcase, in a new line, output "YES" if pallindrome else "NO". (without the quotes)

Constraints:
1 <= T <= 200
1 <= N <= 1000

Example:
Input:
2
56
98
Output:
YES
NO
*/

#include <iostream>
#include<math.h>
using namespace std;

bool checkPallindrome(int num) {
    // find sum of digits of num
    int sum = 0;
    while(num>0) {
        // remainder
        sum+= num%10;
        num/=10;
    }
    
    int noOfDigits = 0, f, l, p;
    num = sum;
    while(num>0) {
        noOfDigits++;
        num/=10;
    }
    
    while(noOfDigits>1) {
        l = sum%10;
        p = pow(10, noOfDigits-1);
        // if sum is 11211, l = 1 & f = 11211 / (10^4) = 1
        f = (int) sum / p;
        if(l!=f)
            return false;
        // (11211%10000)/10 = 1211/10 = 121    
        sum = (sum%p) / 10; 
        noOfDigits-=2;
    }
    return true;
}

int main() {
	int t, n;
	cin>>t;
	while(t--) {
	    cin>>n;
	    if(checkPallindrome(n))
	        cout<<"YES"<<endl;
	    else 
	        cout<<"NO"<<endl;
	}
	
	return 0;
}