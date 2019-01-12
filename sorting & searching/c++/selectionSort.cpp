#include <iostream>
using namespace std;

void swap(int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

/*
    outer loop runs (n-1) times as if n-1 variables are sorted, last one is 
    automatically sorted
    j starts from i+1 as it assumes that at ith position, min value is found 
    between arr[i] to arr[n-1]
    Now, for j=i+1 to a[n-1], if it founds a position where value is less 
    than arr[min], it updates the min(index of min value)
    Once, min index is found in remainng unsorted array, it swaps the 
    arr[i] with arr[min] so that arr[0..i] is sorted & rest becomes unsorted
*/
void selectionSort(int *arr, int n) {
    int i, j;
    int min;
    for(i=0; i<n-1; i++) {
        min = i;
        for(j=i+1; j<n; j++) {
            if(arr[min]>arr[j])
                min = j;
        }
        swap(&arr[i], &arr[min]);
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

	selectionSort(arr, n);
	
	return 0;
}