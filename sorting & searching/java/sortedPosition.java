/*
Sorted Insert Position
Asked in:  
Yahoo
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/

public class Solution {
    public int searchInsert(ArrayList<Integer> arr, int key) {
        int low=0, high = arr.size()-1;
        int mid;
        if (key< arr.get(0) )
            return 0;
        if (key > arr.get(arr.size()-1 ) )
            return arr.size();
        while(low<=high) {
            mid = (low+high)/2;
            if(arr.get(mid) == key) {
                return mid;
            } else if (arr.get(mid) < key) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return low;
    }
}
