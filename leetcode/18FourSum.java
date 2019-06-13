/*
4 sum
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:

The solution set must not contain duplicate quadruplets.

Example:

Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.

A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
*/

class Solution {
    
    
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        if( n < 4)
            return res;
        for(int i = 0; i < n-3; i++) {
            
            if(arr[i]+arr[i+1]+arr[i+2]+arr[i+3] > target)
                break;  // too large
            if(arr[i] + arr[n-1]+ arr[n-2] + arr[n-3] < target)
                continue;   // too small
            
            if(i > 0 && arr[i] == arr[i-1] )
                continue;
            
            for(int j = i +1; j < n-2; j++) {
                if(arr[i]+ arr[j]+ arr[j+1]+arr[j+2] > target)
                    break;
                 
                if(arr[i]+ arr[j] + arr[n-1]+arr[n-2]  < target)
                    continue;
                
                if (j > i+1 && arr[j] == arr[j-1] )
                    continue;
                
                int low = j+1, high = n - 1;
                
                while(low < high) {
                    int sum = arr[i]+ arr[j] +arr[low]+arr[high];
                    if(sum == target) {
                        List<Integer> list = new ArrayList<>();
                        list.add(arr[i] );
                        list.add(arr[j] );
                        list.add(arr[low] );
                        list.add(arr[high]);
                        res.add(list);
                        
                        while(low < high && arr[low] == arr[low+1] )    low++;
                        while(low < high && arr[high] == arr[high-1] )    high--;
                        low++;
                        high--;
                    } else if (sum < target) {
                         while(low < high && arr[low] == arr[low+1] )    low++;
                        low++;
                        
                    } else {
                         while(low < high && arr[high] == arr[high-1] )    high--;
                        high--;
                    }
                }
            }
            
        }
        return res;
    }
    
    
}