/*
Square root 
             
Given an integer x , Your task is to find the  square root of it. If x is not a perfect square, then return floor(√x).

Input Format:
First line of input contains number of testcases T. For each testcase, the only line contains the number x.

Output Format:
For each testcase, print square root of given integer.

User Task:
The task is to complete the function floorSqrt() which should return the square root of given number x.

Constraints:
1 ≤ T ≤ 1000
1 ≤ N ≤ 1000000

Example:
Input:
2
5
4

Output:
2
2

Explanation:
Testcase 1: Since, 5 is not perfect square, so floor of square_root of 5 is 2.
Testcase 2: Since, 4 is a perfect square, so its square root is 2.
*/
long floorSqrt(long x)
	 {
		long low =0, high = x, mid=0;
		while(low<=high) {
		    mid = (low + high)/2;
		    if (mid*mid == x)
		        return mid;
		    else if (mid*mid >x)
		        high = mid-1;
		    else
		        low = mid+1;
		}
		return high;
	 }