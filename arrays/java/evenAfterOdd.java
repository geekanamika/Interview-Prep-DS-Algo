/*

Sort Array By Parity
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000
*/

class Solution {
    public int[] sortArrayByParity(int[] arr) {
        int odd=0, even=0;
        int res[] = new int[arr.length];
        int j=0,i=0;
        for(; i<arr.length; i++) {
            if ((arr[i]&1) == 0) {
                res[j] = arr[i];
                j++;
            }
        }
        for(i=0; i<arr.length; i++) {
            if ((arr[i]&1) == 1) {
                res[j] = arr[i];
                j++;
            }
        }
        return res;
    }
}