#include <iostream>
#include<algorithm>
using namespace std;

int binarySearch(int *arr, int low, int high, int key) {
    if(high<low)
        return -1;
    int mid = (low+high)/2;
    if(arr[mid] == key)
        return mid;
    else if (arr[mid]>key) {
        high = mid-1;
        binarySearch(arr, low, high, key);
    } else {
        low = mid+1;
        binarySearch(arr, low, high, key);
    }    
}

int binarySearchLowerBound(int *arr, int key, int n) {
    int low =0, high = n-1;
    int ans = -1;
    
    while(low<=high) {
        int mid = (low+high)/2;
        if(arr[mid] == key) {
            ans = mid;
            high = high-1;
        } else if (arr[mid]>key) {
            high = mid-1;
        } else {
            low = mid+1;
        } 
    }
    return ans;
}

int binarySearchUpperBound(int *arr, int key, int n) {
    int low =0, high = n-1;
    int ans = -1;
    
    while(low<=high) {
        int mid = (low+high)/2;
        if(arr[mid] == key) {
            ans = mid;
            low = mid+1;
        } else if (arr[mid]>key) {
            high = mid-1;
        } else {
            low = mid+1;
        } 
    }
    return ans;
}

bool myComparator(int a, int b){
    return a>b;
}

int main() {
    int arr[] = {-1, 8, 4, 11, 0, 3, 0 };
    int n = sizeof(arr)/sizeof(arr[0]);
    sort(arr, arr+n);
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
    cout<<endl;    
    
    cout<<"lower bound: "<<binarySearchLowerBound(arr,0, n )<<endl;
    cout<<"normal bound: "<<binarySearch(arr, 0, n-1, 0)<<endl;
    cout<<"upper bound: "<<binarySearchUpperBound(arr, 0, n)<<endl;
    return 0;
}