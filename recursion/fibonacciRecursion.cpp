#include <stdio.h>
#include <iostream>
#include<cstring>
using namespace std;

int printFiboncci(int n) {
    if(n == 0)
        return 1;
    else if (n==1)
        return 1;
    return printFiboncci(n-1) + printFiboncci(n-2);    
}
int main() {
	//code
	cout<<printFiboncci(4);
	return 0;
}