#include <iostream>
using namespace std;
/*
                    1
                 1   1
               1   2   1
             1   3   3   1


                    1   
                  1   1   
                1   2   1   
              1   3   3   1   
            1   4   6   4   1   
          1   5   10   10   5   1   
        1   6   15   20   15   6   1   
*/ 

int factorial(int num) {
    // base case 
    if(num==0 || num==1)
        return 1;
    return num*factorial(num-1);    
}

int getPascalValue(int i, int j) {
    int num = factorial(i);
    int den = factorial(i-j) * factorial(j);
    return num/den;
}

void printPattern(int n) {
    
    int s,i,j,k;
    for(i=0, s= 2*(n-1); i<n; i++,s-=2) {
        // earlier space
        for(j=1; j<=s; j++) {
            cout<<" ";
        }
        for(j=0; j<=i; j++) {
            cout<<getPascalValue(i, j)<<"   ";
        }
        cout<<endl;
    }
    
}

int main() {
	int t;
	cin>>t;
	if(t<=10 && t>=1)
	    printPattern(t);
	return 0;
}