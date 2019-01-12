#include <stdio.h>
#include <iostream>
#include<cstring>
using namespace std;

long powerFunction(int a, int b){
    if(b==1)
        return a;
    
    return a * powerFunction(a, b-1);    
}
int main() {
	//code
	cout<<powerFunction(3,4);
	return 0;
}