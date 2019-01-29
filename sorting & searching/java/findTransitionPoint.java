/*

12:11	12:26	
15min

Find Transition Point Submissions: 4594   Accuracy: 58.56%   Difficulty: Easy   Marks: 2
Associated Course(s):   Interview Preparation
         
You are given a sorted array containing only numbers 0 and 1. Find the transition point efficiently. Transition point is a point where "0" ends and "1" begins.

Input:

You have to complete the method which takes 2 argument: the array arr[] and size of array N. You should not read any input from stdin/console. There are multiple test cases. For each test cases, this method will be called individually.

Output:

Your function should return transition point.

Constraints:

1 ≤ T ≤ 100
1 ≤ N ≤ 500000
0 ≤ C[i] ≤ 1

Example:

Input
1
5
0 0 0 1 1

Output
3
*/

class GfG
{
	int transitionPoint(int arr[],int n)
	{
        if ( arr[n-1] == 0) {
            return n;
        } else if (arr[0] == 1) {
            return 0;
        }
        
        int low = 0, high = n-1,mid;
        while (low<=high) {
            mid = (low+high)/2w;
            if (arr[mid] == 1 && mid!=0 && arr[mid-1] == 0) {
                return mid;
            } else if (arr[mid] ==0 ) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return 0;
    } 
}
