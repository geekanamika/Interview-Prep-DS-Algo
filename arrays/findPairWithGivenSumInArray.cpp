/*
 * find pair with given sum in an unsorted array
 */

#include <iostream>
#include<algorithm>
using namespace std;

// complexity: nLogn

bool findPairWithGivenSum(int *arr, int n, int sum) {
    int low= 0, high = n-1;
    bool flag = false;
    
    sort(arr, arr+n);
    
    while(low<=high) {
        if(arr[low]+arr[high] == sum) {
            flag = true;
            cout<<arr[low]<<" "<<arr[high]<<endl;
            low++;
        }
        else if (arr[low]+arr[high] < sum)
            low++;
        else high--;    
    }
    return flag;
}

int main() {
	int arr[]= {1, 12, 4, 6, 10, -8};
	int n = sizeof(arr)/sizeof(arr[0]);
	int sum = 400;
	if(!findPairWithGivenSum(arr, n, sum))
	    cout<<"No"; 
	return 0;
}