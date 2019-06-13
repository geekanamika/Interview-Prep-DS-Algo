/*
Container with most water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
Example:

Input: [1,8,6,2,5,4,8,3,7]
Output: 49
Note: You may not slant the container and n is at least 2.
*/

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        if(n <= 0)
            return 0;
        int max = Integer.MIN_VALUE;
        
        int low = 0, high = n-1;
        
        while(low < high) {
            int temp = high - low;
            max = Math.max(max, temp * Math.min(height[high],height[low] ) );
            if(height[low] == height[high] ) {
                high--;
                low++;
            } else if (height[low] < height[high])
                low++;
            else
                high--;
        }
        return max;
    }
}