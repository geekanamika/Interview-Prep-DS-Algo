/*
1. Two Sum
x
Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> st = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++) {
            st.put(nums[i],i );
        }
        int res[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(st.containsKey(target - nums[i] ) && st.get(target - nums[i]) != i){
                
                res[0] = i;
                res[1] = st.get(target - nums[i]);
                return res;
            }
        }
        return res;
        
    }
}