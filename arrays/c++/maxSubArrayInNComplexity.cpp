#include <iostream>
using namespace std;
// https://www.geeksforgeeks.org/size-subarray-maximum-sum/
void maximumSubArraySum(int *arr, int n){
    int curr_sum=0, max_sum=0;
    int start=0, end, s=0;
    
    for(int i=0; i<n; i++) {
        curr_sum += arr[i];
        if(curr_sum<0) {
            curr_sum = 0;
            s = i+1;
        }
            
        if (max_sum<curr_sum){
            max_sum = curr_sum;
            start = s;
            end = i;
        }
            
    }
    for(int i=start; i<=end; i++)
        cout<<arr[i]<<" ";
    cout<<endl<<"max sum is "<<max_sum;        
}
int main() {
	int arr[] = {4,5,-1,-7};
	int n = sizeof(arr)/sizeof(arr[0]);
    maximumSubArraySum(arr, n);
	return 0;
}