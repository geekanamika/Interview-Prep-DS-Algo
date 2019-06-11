/**
Median to Two Sorted Arrays
There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        if (n < m)
            return getMedian(nums1, n, nums2, m);
        else
            return getMedian(nums2, m, nums1, n);
    }
    
    public double getMedian(int a[], int al, int b[], int bl) {
        int min = 0, max = al;
        int i = 0 , j = 0, median = 0;
        
        while(min <= max) {
            i = (min + max)/2;
            j = (al + bl + 1)/2 - i;
            
            // right check 
            if (j > 0 && i < al && b[j-1] > a[i] )
                min = i + 1;
            else if (j < bl && i > 0 && b[j] <a[i-1])
                max = i-1;
            else {
                // found
                if(i == 0)
                    median =  b[j-1];
                else if (j == 0)
                    median = a[i-1];
                else
                    median = Integer.max(b[j-1], a[i-1]);
                break;
            }
        }
        
        if((al + bl)%2 == 1)
            return (double)median;
        // Elements from a[] in the  
        // second half is an empty set.  
        if (i == al) 
            return (median + b[j]) / 2.0; 
              
        // Elements from b[] in the 
        // second half is an empty set. 
        if (j == bl) 
            return (median + a[i]) / 2.0; 
          
        return (median + Integer.min(a[i],  
                                 b[j])) / 2.0; 
    }
}