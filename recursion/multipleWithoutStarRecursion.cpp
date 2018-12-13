#include <iostream>
using namespace std;

int multi(int a, int b){
    if(b==1){
        return a;
    }
    if(b>0)
        return a + multi(a, b-1);
    else if (b<0)
        return -multi(a, -b);
}
int main() {
	cout<<multi(-4,5);
	return 0;
}