#include <iostream>
using namespace std;

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

/* bubble sort like bubble in water tries to go upwards, 
    bigger numbers goes in right and hence, it is known as bubble sort
    In this sort, after every one iteration of J, one number is shifted to right
    Hence, n-i-1 are always sorted in right direction 
    so J goes from 0 to n-i-2 */
int bubbleSortWithOptimization(int *arr, int n) {
    int i, j, temp, flag=0;
    bool swapped;
    /* it goes from 0 to n-2 i.e runs n-1 times as at last
        when n-1 are sorted, 1 left will be automatically sorted 
        */
    for(i=0; i<n-1; i++) {
        flag++;
        swapped = false;
        for(j=0; j<n-i-1; j++) {
            if(arr[j]>arr[j+1]) {
                swapped = true;
                swap(&arr[j], &arr[j+1]);
            }
        }
        if(swapped == false) 
            break;
    }
    
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
    return flag;    
}

int bubbleSort(int *arr, int n) {
    int i, j, temp, flag=0;
    /* it goes from 0 to n-2 i.e runs n-1 times as at last
        when n-1 are sorted, 1 left will be automatically sorted 
        */
    for(i=0; i<n-1; i++) {
        flag++;
        for(j=0; j<n-i-1; j++) {
            if(arr[j]>arr[j+1]) {
                swap(&arr[j], &arr[j+1]);
            }
        }
    }
    
    for(int i=0; i<n; i++)
        cout<<arr[i]<<" ";
    return flag;    
}


int main() {
    int n;
    cin>>n;
    int arr[20];
    for(int i=0; i<n; i++)
        cin>>arr[i];

    cout<<"\nNo of times outer loop runs with optimization "<<bubbleSortWithOptimization(arr, n)<<endl;   
       
    cout<<"\nNo of times outer loop runs "<<bubbleSort(arr, n)<<endl;   
    
    
    return 0;
}