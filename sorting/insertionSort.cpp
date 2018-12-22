#include <iostream>
using namespace std;

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

/*
    It uses concept that in beginning arr[0] is sorted & arr[1..n-1] is unsorted
    If we can find proper/sorted position for arr[i] in sorted array on left,
    array will be sorted.

    inner loop states that index of j>=0 as array index remain 0 to n-1
    and only loop till arr[j] is greater than than key(initially) taken from
    arr[i]. If while condition holds, shift the arr[j] towards right & 
    decrease J

 */   

void insertionSort(int *arr, int n) {
    int i, j;
    int key;
    
    for(int i=0; i<n; i++) {
        key = arr[i];
        j = i-1;
        while(j>=0 && arr[j]>key) {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = key;
    }
    
    for(i=0; i<n; i++)
        cout<<arr[i]<<" ";
}


int main() {
	int n;
	cin>>n;
	int arr[20];
	for(int i=0; i<n; i++)
	    cin>>arr[i];

	insertionSort(arr, n);
	
	return 0;
}