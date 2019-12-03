// https://leetcode.com/problems/two-sum/submissions/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        int res[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(set.containsKey(target - nums[i]) ) {
                res[0] = set.get(target -nums[i]);
                res[1] = i;
                return res;
            }
            set.put(nums[i], i);
        }
        return new int[0];
        
    }
}