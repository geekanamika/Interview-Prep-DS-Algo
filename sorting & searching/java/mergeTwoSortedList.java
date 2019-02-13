/* Merge Two Sorted Lists II
Asked in:  
Adobe
Expedia
Microsoft
Given two sorted integer arrays A and B, merge B into A as one sorted array.

 Note: You have to modify the array A to contain the merge of A and B. Do not output anything in your code.
TIP: C users, please malloc the result into a new array and return the result. 
If the number of elements initialized in A and B are m and n respectively, the resulting size of array A after your code is executed should be m + n

Example :

Input : 
         A : [1 5 8]
         B : [6 9]

Modified A : [1 5 6 8 9]
*/

public class Solution {
    public void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i =0 , j = 0;
        int ta, tb, temp;
        ArrayList<Integer> res = new ArrayList<Integer>();
        while (i < a.size() && j < b.size()) {
            ta = a.get(i);
            tb = b.get(j);
            if (ta <= tb) {
                res.add(ta);
                i++;
            } else {
                res.add(tb);
                j++;
            }
        }
        
        while (i < a.size() ) {
            res.add(a.get(i) );
            i++;
        }
        
        while (j < b.size() ) {
            res.add(b.get(j) );
            j++;
        }
        i = 0;
        while (i < a.size() ) {
            a.set(i, res.get(i) );
            i++;
        }
        
        while (i < res.size() ) {
            a.add(res.get(i));
            i++;
        }
        
        
    }
}
