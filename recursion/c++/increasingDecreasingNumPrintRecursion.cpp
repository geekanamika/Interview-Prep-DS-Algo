#include <stdio.h>
#include <iostream>
#include<cstring>
using namespace std;

void printDec(int n) {
    if(n == 1){
        cout<<1;
        return;
    }
    cout<<n<<", ";
    return printDec(n-1);   
}

void printInc(int n) {
    if(n == 1){
        cout<<1;
        return;
    }
    printInc(n-1);  
    cout<<", "<<n;
    return;  
}


int main() {
	//code
	//printDec(4);
	cout<<endl;
	printInc(4);
	return 0;
}