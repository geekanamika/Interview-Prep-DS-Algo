/*
Remove Element from Array
Asked in:  
Amazon
Remove Element

Given an array and a value, remove all the instances of that value in the array. 
Also return the number of elements left in the array after the operation.
It does not matter what is left beyond the expected length.

 Example:
If array A is [4, 1, 1, 2, 1, 3]
and value elem is 1, 
then new length is 3, and A is now [4, 2, 3] 
Try to do it in less than linear additional space complexity.
*/

public class Solution {
    public int removeElement(ArrayList<Integer> arr, int b) {
        
        int c = -1 ;
        int i = 0;
        int temp;
        while (i < arr.size()) {
            temp = arr.get(i);
            if (c==-1 && temp== b) {
                c = i;
            } else if (c!=-1 && temp != b) {
                arr.set(c, temp);
                c++;
            } 
            i++;
        }
        if (c!=-1)
            return c;
        else
            return arr.size();
        
    }
}
