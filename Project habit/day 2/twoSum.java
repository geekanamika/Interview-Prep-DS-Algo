// 1. Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int curr;
        for(int i = 0; i < nums.length; i++) {
            curr = target - nums[i];
            if(map.containsKey(curr)) {
                int res[] = new int[2];
                res[0] = map.get(curr);
                res[1] = i;
                return res;
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[0];
    }
}