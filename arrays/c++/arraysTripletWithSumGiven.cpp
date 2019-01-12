/*
ARRAYS-TARGET SUM TRIPLETS
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.


Input Format:
First line contains input N. Next N lines contains the elements of array and N+1 line contains target number.

Constraints:
Length of Array should be between 1 and 1000.
Output Format:
Print all the triplet present in the array.

Sample Input:
9
5
7
9
1
2
4
6
8
3
10
Sample Output:
1, 2 and 7
1, 3 and 6
1, 4 and 5
2, 3 and 5

*/

#include <iostream>
#include<algorithm>
using namespace std;

void findTriplets(int *arr, int n , int sum) {
    int l, h, i, curr;
    for(i=0; i<n-2; i++) {
        curr = sum - arr[i];
        l = i+1;
        h = n-1;
        while(l<h) {
            if(arr[l] + arr[h] == curr) {
                cout<<arr[i]<<", "<<arr[l]<<" and "<<arr[h]<<endl;
                l++;
            } else if (arr[l] + arr[h] < curr) {
                l++;
            } else if (arr[l] + arr[h] > curr) {
                h--;
            }
        }
    }
}

int main() {
	int n, sum;
	int arr[1000];
	
	    cin>>n;
	    for(int i=0; i<n; i++) {
    	    cin>>arr[i];   
    	}
    	cin>>sum;
    	sort(arr, arr+n);
    	findTriplets(arr, n, sum);
	return 0;
}