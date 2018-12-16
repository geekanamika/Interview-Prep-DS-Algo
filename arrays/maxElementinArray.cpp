#include <iostream>
#include<bits/stdc++.h>
using namespace std;

int maxElementWithStl(int arr[], int n) {
    return *max_element(arr, arr+n);
}

int maxElement(int arr[], int n){
    int i=0, max = arr[0];
    for (; i<n; i++) {
        if(max<arr[i])
            max = arr[i];
    }
    return max;
}

int main() {
    int n;
    int arr[10000];
    cin>>n;
    for(int i=0; i<n; i++) 
        cin>>arr[i];
    cout<<maxElement(arr, n)<<" "<<maxElementWithStl(arr, n);
	//code
	return 0;
}