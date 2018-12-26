#include <iostream>
#include<algorithm>
using namespace std;

double calculateSqrt(int n, int p) {
    int low = 0, high = n, mid;
    float ans;
    while(low<=high) {
        mid = (low+high)/2;
        if(mid*mid == n) {
            ans = mid;
            break;
        } else if (mid*mid > n) {
            high = mid-1;
        } else {
            ans = mid;
            low = mid + 1;
        }
    }
    // find p precision after sqrt
    float inc = 0.1;
    for (int i=0; i<p; i++) {
        ans += inc;
        while(ans*ans < n) {
            ans+=inc;
        }
        ans = ans-inc;
        inc = inc/10;
    }
    
    return ans;
}

int main() {
	int n, p;
	cin>>n>>p;
	cout<<"sqrt is: "<<calculateSqrt(25 , 3);
	return 0;
}