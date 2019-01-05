/**
Longest Consecutive Subsequence 
       
Given an array A of integers. The task is to complete the function which returns an integer denoting the length of the longest sub-sequence such that elements in the sub-sequence are consecutive integers, the consecutive numbers can be in any order.

Input:
The first line of input contains an integer T denoting the no of test cases. Then T test cases follow. Each test case contains an integer N. Then in the next line are N space separated values of the array A.

Output:
For each test case in a new line output will be the length of the longest consecutive increasing sub-sequence present in the array A[ ].

Constraints:
1 <= T <= 100
1 <= N <= 106
1 <= Ai <= 108

Example(To be used only for expected output):
Input:
2
7
1 9 3 10 4 20 2
11
36 41 56 35 44 33 34 92 43 32 42
Output:
4
5

Explanation:
Testcase 1: Logest consecutive subsequence is 1, 2, 3, 4 of length 4.
*/

int findLongestConseqSubseq(int arr[], int n)
{
    sort(arr, arr+n);
    int len = -1;
    int sum = 1;
    for(int i=0; i<n-1; i++) {
        // in sorted array, if next element is +1 greater than current,
        // increase length of consecutive subsequence
        if(arr[i+1] == arr[i]+1) {
            sum++;
        } // if next element is similar to current, ignore it 
         // if next element is neither +1 nor similar, restart counting & update final count
        else if (arr[i+1] != arr[i]) {
            if(sum> len ) {
                len = sum;
            }
            sum = 1;
        }
    }
    // for last subsequence which was left due to array end
    if(sum> len ) {
        len = sum;
    }
    return len;
}