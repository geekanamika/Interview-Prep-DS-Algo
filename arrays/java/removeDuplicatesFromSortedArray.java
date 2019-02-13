/*
Remove Duplicates from Sorted Array
Asked in:  
United Healthgroup
Amazon
Google
Microsoft
Expedia
Remove duplicates from Sorted Array
Given a sorted array, remove the duplicates in place such that each element appears only once and return the new length.

Note that even though we want you to return the new length, make sure to change the original array as well in place

Do not allocate extra space for another array, you must do this in place with constant memory.
*/
public class Solution {
	public int removeDuplicates(ArrayList<Integer> arr) {
	    int j = 1;
	    int c, s;
	    int curr = 1;
	    while (j < arr.size()) {
	        c = arr.get(j-1);
	        s = arr.get(j);
	        if (c!= s) {
	            arr.set(curr, s);
                curr++;
	        } 
            j++;
	    }
	    return curr;
	}
}
