/*
Merge Sort 
                         
The task is to complete merge() function which is used to implement Merge Sort.

Input:
First line of the input denotes number of test cases 'T'. First line of the test case is the size of array and second line consists of array elements.


Output:
Sorted array in increasing order is displayed to the user.


Constraints:
1 <=T<= 50
1 <=N<= 1000
1 <=arr[i]<= 1000


Example:

Input:
2
5
4 1 3 9 7
10
10 9 8 7 6 5 4 3 2 1

Output:
1 3 4 7 9
1 2 3 4 5 6 7 8 9 10

*/

import java.util.*;
public class Main {
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        
        mergeSort(arr, 0, n-1);
        
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
    
    private static void mergeSort(int arr[], int low, int high) {
        if(low<high) {
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            
            merge(arr, low, mid, high);
        }
    }
    
    private static void merge(int arr[], int l, int m, int r)
    {
         // find length of smaller subarrays
         int n1 = m-l+1;
         int n2 = r - m;
         
         // create new temp sub-arrays
         int a1[] = new int[n1];
         int a2[] = new int[n2];
         for(int i=0; i<n1; i++) {
             a1[i] = arr[l+i];
         }
         for(int j=0; j<n2; j++) {
             a2[j] = arr[m+1+j];
         }
         // merge them while i<n1 & j<n2
         int k=l, i=0, j=0;
         while(i<n1 && j<n2) {
             if(a1[i] <= a2[j] ) {
                 arr[k] = a1[i];
                 i++;
                 k++;
             } else if(a1[i] > a2[j] ) {
                 arr[k] = a2[j];
                 j++;
                 k++;
             }
         }
         // attach rest of the values 
         while(i<n1) {
             arr[k] = a1[i];
             i++;
             k++;
         }
         while(j<n2) {
             arr[k] = a2[j];
             j++;
             k++;
         }
    }
}
