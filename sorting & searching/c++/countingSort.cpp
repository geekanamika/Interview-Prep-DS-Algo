#include <iostream>
#include<vector>
using namespace std;

// in range of 0-9
void countingSort(int *arr, int n) {
    int freq[10] = {0};
    // create the frequency array
    for(int i=0; i<n; i++) {
        freq[arr[i]]++;
    }
    
    // modify the frequency array so that it contains position of every number
    for(int i=1; i<n; i++) {
        freq[i] = freq[i]+freq[i-1];
    }
    // not stable
    // create an output array which will contain the sorted array
    int output[10];
    // for(int i=0; i<n; i++) {
    //     output[freq[arr[i]]-1] = arr[i];
    //     freq[arr[i]]--;
    // }
    // stable algo
    for(int i=n-1; i>=0; i--) {
        output[freq[arr[i]]-1] = arr[i];
        freq[arr[i]]--;
    }
    
    // give back to old array
    for(int i=0; i<n; i++) {
        arr[i] = output[i];
        cout<<arr[i]<<" ";
    }
    
    
}

int main() {
	int arr[] = {8,7,1,2,6,9,6,5,2,4};
	int n = sizeof(arr)/sizeof(arr[0]);
	countingSort(arr, n);
}