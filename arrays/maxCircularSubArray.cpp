#include <iostream>
#include<vector>
#include<algorithm>
using namespace std;

/**
    check concept from pdf
*/
int kadene(vector<int> arr, int n ) {
    long sum=0, curr =0;
    for(int i=0; i<n; i++) {
        curr +=arr[i];
        if(curr<0)  {
            curr =0;
        }
        if(curr>sum) {
            sum = curr;
        }
    }
    return sum;
}

int getMaxCircularSum(vector<int> arr, int n) {
    int caseOne = kadene(arr, n);
    int cs =0;
    for(int i=0; i<n; i++) {
        cs += arr[i];
        arr[i] = -arr[i];
    }
    int caseTwo = cs + kadene(arr, n);
    return caseOne>caseTwo? caseOne : caseTwo;
}

int main() {
	int n, temp;
    int t;
    cin>>t;
    while(t--) {
        vector<int> arr;
        cin>>n;
        for(int i=0; i<n; i++) {
            cin>>temp;
            arr.push_back(temp);  
        }
        cout<<getMaxCircularSum(arr, n)<<endl;
    }
	    
	return 0;
}