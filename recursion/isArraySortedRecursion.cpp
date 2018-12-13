#include <stdio.h>
#include <iostream>
#include<cstring>
using namespace std;

bool isSorted(int *a, int n) {
    if(n==1)
        return true;
    else if (a[0]<a[1] && isSorted(a+1, n-1)){
        return true;
    }
   
     return false;
}
int main() {
    int a[] = {4,13,9,12};
    
	//code
	if(isSorted(a, 4))
	    cout<<"yes";
	else 
	    cout<<"no";
	return 0;
}