/*
3 sum
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if(n <= 2)
            return res;
       
        for(int i = 0; i+3 <= n; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i-1])) { 
                int l = i + 1, h = n -1;
                int key = 0-nums[i];
                while(l < h) {
                    if(nums[l] + nums[h] == key ){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i] );
                        temp.add(nums[l] );
                        temp.add(nums[h] );
                        res.add(temp);
                        while (l < h && nums[l] == nums[l+1]) l++;
                        while (l < h && nums[h] == nums[h-1]) h--;
                        l++;
                        h--;
                    } else if (nums[l] + nums[h] > key ) {
                        
                        while (l < h && nums[h] == nums[h-1]) h--;
                        h--;
                    }
                    else {
                        // l++;
                        while (l < h && nums[l] == nums[l+1]) l++;
                        l++;
                    }
                }
            }
            else if (nums[i] > 0 )
                break;
        }
        return res;
    }
}