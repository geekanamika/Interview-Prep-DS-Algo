/*
Intersection Of Sorted Arrays
Asked in:  
Facebook
Google
Find the intersection of two sorted arrays.
OR in other words,
Given 2 sorted arrays, find all the elements which occur in both the arrays.

Example :

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 3 5]

Output : [3 3 5]

Input : 
    A : [1 2 3 3 4 5 6]
    B : [3 5]

Output : [3 5]
*/

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] intersect(final int[] arr, final int[] brr) {
        if (arr.length == 0 || brr.length == 0 )
            return new int[0];
        
        int na = arr.length;
        int nb = brr.length;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < na && j < nb) {
            if (arr[i] == brr[j]) {
                res.add(arr[i]);
                i++;
                j++;
            } else if (arr[i] < brr[j]){
                while (i < na && arr[i] < brr[j]) {
                    i++;
                }
            } else {
                while (j < nb && arr[i] > brr[j]) {
                    j++;
                }
            }
        }
        
        int r[] = new int[res.size()];
        for (i = 0; i<res.size(); i++){
            r[i] = res.get(i);
        }
        return r;
        
    }
}