/*
 * find minimum element in a sorted and rotated array
 */

#include <iostream>
using namespace std;

int findMinimumElementInSortedRotatedArray(int *arr, int low, int high) {
    if(high<low)
        return -1;
    int mid = (low+high)/2;
    // before element is larger, hence mid is the minimum element in sorted array
    if (arr[mid-1]>arr[mid])
        return mid;
    else if (arr[mid] > arr[mid+1]) // if later element is smaller, it's pivot value/min 
        return mid+1;
    else if (arr[mid] > arr[high])  // since, center has greater than last element
                                    // pivot is is right half else left half
        return findMinimumElementInSortedRotatedArray(arr, mid+1, high);
    else 
        return findMinimumElementInSortedRotatedArray(arr, low, mid-1);    
}

int main() {
	int arr[]= {6,7,8,9,1,2,3,4,5};
	int n = sizeof(arr)/sizeof(arr[0]);
	cout<<arr[findMinimumElementInSortedRotatedArray(arr, 0, (n-1))]<<endl; 
	
    int arr1[] = {11, 15, 6, 8, 9, 10};
    n = sizeof(arr1)/sizeof(arr1[0]);
	cout<<arr1[findMinimumElementInSortedRotatedArray(arr1, 0, (n-1))]<<endl; 
	
	int arr2[] = {11, 15, 0, 1, 9, 10};
	n = sizeof(arr2)/sizeof(arr2[0]);
	cout<<arr2[findMinimumElementInSortedRotatedArray(arr2, 0, (n-1))]<<endl;
	return 0;
}