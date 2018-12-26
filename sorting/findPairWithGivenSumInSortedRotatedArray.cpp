/*
 *  Given a sorted and rotated array, find if there is a pair with a given sum
    Given an array that is sorted and then rotated around an unknown point. Find if the array has a pair with a given sum ‘x’. It may be assumed that all elements in the array are distinct.
    Examples :

    Input: arr[] = {11, 15, 6, 8, 9, 10}, x = 16
    Output: true
    There is a pair (6, 10) with sum 16
 */

#include <iostream>
#include<algorithm>
using namespace std;

int findMinimumElementInSortedRotatedArr(int *arr, int low, int high) {
    if(high<low) {
        return -1;
    } 
    int mid = (low+high)/2;
    if(arr[mid-1] > arr[mid])
        return mid;
    else if (arr[mid] > arr[mid+1])    
        return mid+1;
    else if (arr[mid] < arr[high])
        return findMinimumElementInSortedRotatedArr(arr, mid+1, high);
    else return findMinimumElementInSortedRotatedArr(arr, low, mid-1);    
}

bool findPairWithGivenSumInSortedRotatedArr(int *arr, int n, int sum) {
    
    bool flag = false;
    
    // find pivot/minimum element of given array first
    int pivot = findMinimumElementInSortedRotatedArr(arr, 0, n-1);
    if(pivot == -1)
        return false;
    int low= pivot, high = pivot-1;
    while(low!=high) {
        if(arr[low]+arr[high] == sum) {
            flag = true;
            cout<<arr[low]<<" "<<arr[high]<<endl;
            low = (low+1)%n;
        }
        else if (arr[low]+arr[high] < sum) {
            // approaching in circular manner & making low = 0 if current low =n-1
            // else low = low+1
            low = (low+1)%n;
        }
        else {
            // approaching in circular manner & making high = n-1 if current high =0
            // else high = high-1
            high = (high + n -1)%n;
        }  
    }
    return flag;
}

int main() {
	int arr[]= {11, 15, 6, 8, 9, 10};
	int n = sizeof(arr)/sizeof(arr[0]);
	int sum = 23;
	if(!findPairWithGivenSumInSortedRotatedArr(arr, n, sum))
	    cout<<"No"; 
	return 0;
}