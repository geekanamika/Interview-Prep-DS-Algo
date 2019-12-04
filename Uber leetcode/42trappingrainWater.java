// https://leetcode.com/problems/trapping-rain-water/
class Solution {
    public int trap(int[] height) {
        int left[] = new int[height.length];
        int right[] = new int[height.length];
        if(height.length <= 2)
            return 0;
        
        left[0] = 0;
        for(int i = 1; i < height.length; i++) {
            left[i] = Integer.max(height[i-1], left[i-1]);
            System.out.print(left[i]  + " ");
        }
        System.out.println();
        right[height.length - 1] = 0;
        for(int i = height.length - 2; i >= 0; i--) {
            right[i] = Integer.max(height[i+1], right[i+1]);
            System.out.print(right[i] + " ");
        }
        System.out.println();
        int sum = 0, curr;
        for(int i = 0; i < height.length; i++) {
            curr = (Integer.min(left[i], right[i]) - height[i]);
            sum +=  curr > 0 ? curr : 0;
            System.out.print(curr);
        }
        return sum;
    }
}