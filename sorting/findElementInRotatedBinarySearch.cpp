#include <iostream>
using namespace std;

// only for all elements are distinct
// Time Complexity : Log n
// space complexity: 

int rotatedBinarySearch(int *arr, int low, int high, int key) {
    if(high<low)
        return -1;
    int mid = (low+high)/2;
    if(arr[mid]==key)
        return mid;
    // array left is sorted
    if(arr[low]<=arr[mid]) {
        // key exists in range of left sorted array
        if(arr[low]<=key && key <= arr[mid]) {
            // recurse from low to mid-1
            return rotatedBinarySearch(arr, low, mid-1, key);
        } else {
            // recuse from mid+1 to end
            return rotatedBinarySearch(arr, mid+1, high, key);
        }
    } 
    // if array left wasn't sorted, then arr mid+1 to end must be sorted
    // recurse from mid+1 to end if key exists between them
    if(arr[mid]<=key && key<=arr[high])
        return rotatedBinarySearch(arr, mid+1, high, key);
    // key exists between right part of mid but unsorted area
    return rotatedBinarySearch(arr, low, mid-1, key);
}

int main() {
	int arr[]= {6,7,8,9,1,2,3,4,5};
	int key, t;
	int n = sizeof(arr)/sizeof(arr[0]);
	cin>>t;
	while(t--) {
	    cin>>key;
	    
	    cout<<rotatedBinarySearch(arr, 0, (n-1), key)<<endl; 
	}
	
	return 0;
}