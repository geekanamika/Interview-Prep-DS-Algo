/**
Maximum Sub Array 
        
Find out the maximum sub-array of non negative numbers from an array.
The sub-array should be continuous. That is, a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:
A : [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]

NOTE 1: If there is a tie, then compare with segment's length and return segment which has maximum length
NOTE 2: If there is still a tie, then return the segment with minimum starting index

Input:
The first line contains an integer T, depicting total number of test cases. 
Then following T lines contains an integer N depicting the size of array and next line followed by the value of array.

Output:
Print the Sub-array with maximum sum.

Constraints:
1 ≤ T ≤ 40
1 ≤ N ≤ 100
-100 ≤ A[i] ≤ 100

Example:
Input
2
3
1 2 3
2
-1  2
Output
1 2 3
2
*/

#include <iostream>
using namespace std;

void printMaxNonNegativeSubArray(int *arr, int n) {
    int sum = 0, csum = 0,i;
    int cs=0, ce =0, s=-1, e=-1;
    bool pos = false;
    for(i=0; i<n; i++) {
        if(arr[i]>=0 && !pos) {
            csum += arr[i];
            pos = true;
            cs = i;
        } else if (arr[i]>=0 && pos) {
            csum += arr[i];
        } else if (arr[i]<0 && pos) {
            pos = false;
            ce = i-1;
            if(csum>sum) {
                sum = csum;
                s = cs;
                e = ce;
            } else if (csum == sum) {
                if(e-s <= ce-cs) {
                    e = ce;
                    s = cs;
                }
            }
            csum = 0;
        }
    }
    //cout<<cs<<" "<<ce<<" "<<s<<" "<<e<<endl;
    if(arr[i-1]>=0)
        ce = i-1;
    
    // check for last positive sub-array
    if(csum>sum) {
        sum = csum;
        s = cs;
        e = ce;
    } else if (csum == sum) {
        if(e-s < ce-cs) {
            e = ce;
            s = cs;
        }
    }
    for(int i=s; i<=e && i>=0; i++) {
            cout<<arr[i]<<" ";
    }
    
    cout<<endl;
}

int main() {
	int t, n;
	int arr[101];
	cin>>t;
	while(t--) {
	    cin>>n;
	    for(int i=0; i<n; i++) {
	        cin>>arr[i];
	    }
	    printMaxNonNegativeSubArray(arr, n);
	}
	return 0;
}