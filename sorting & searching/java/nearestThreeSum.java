/*
Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target. 
Return the sum of the three integers.

Assume that there will only be one solution

Example: 
given array S = {-1 2 1 -4}, 
and target = 1.

The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
*/

public class Solution {
    public int threeSumClosest(ArrayList<Integer> arr, int reqsum) {
        if (arr.size() < 3)
            return 0 ;
        // sort the array
        Collections.sort(arr);
        // keep a pointer from i = 0 to arr.length() - 2
        int i = 0;
        int n = arr.size();
        int low , high;
        int curr;
        int res = arr.get(0)+ arr.get(1) + arr.get(2);
        int currSum;
        while (i < (n-2)) {
            
            low = i+1;
            high = n-1;
            curr = arr.get(i);
            while (low < high) {
                currSum = arr.get(low) + arr.get(high)+ curr;
                if(currSum == reqsum) {
                    return reqsum;
                } else if (currSum < reqsum) {
                    res = nearSum(currSum, reqsum, res);
                    low++;
                } else {
                    res = nearSum(currSum, reqsum, res);
                    high--;
                }
            }
            i++;
        }
        return res;
    }
    
    public int nearSum (int currSum, int req, int res) {
        
        if (Math.abs(currSum - req) < Math.abs(res - req)) {
            return currSum;
        } else
            return res;
    }
}
