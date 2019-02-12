/*
 Intersection of Two Arrays
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.
*/
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i=0; i<nums1.length; i++) {
            s.add(nums1[i]);
        }
        int j=0;
        for(int i=0; i<nums2.length; i++) {
            if (s.contains(nums2[i])) {
                nums2[j] = nums2[i];
                s.remove(nums2[i]);
                j++;
            }                
        }
        int res[] = new int[j];
        
        for(int i=0; i<j; i++) {
            res[i] = nums2[i];
        }
        return res;
    }
}