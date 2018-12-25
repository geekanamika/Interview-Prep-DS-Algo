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

bool myComparator(int a, int b){
    return a>b;
}

int main() {
    int arr[] = {-1, 8, 4, 11, 2, 3, 0 };
    int n = sizeof(arr)/sizeof(arr[0]);
    sort(arr, arr+n);
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
    cout<<endl;    
    cout<<binarySearch(arr, 0, n-1, 8)<<endl;
    cout<<binarySearch(arr, 0, n-1, 12)<<endl;
    return 0;
}