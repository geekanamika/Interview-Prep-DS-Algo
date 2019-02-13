public class Solution {
    public int searchMatrix(ArrayList<ArrayList<Integer>> arr, int key) {
        // find which row can have that number 
        
        int row = arr.size(), col = arr.get(0).size();
        int mid;
        // val < first or > last element of matrix
        if (key < arr.get(0).get(0) || key > arr.get(row-1).get(col-1) )
            return 0;
        int low = 0, high = (row*col)-1;
        // simple binary search
        int x, y;
        while (low <= high) {
            mid = (low + high)/2;
            x = mid / col;
            y = mid % col;
            if (arr.get(x).get(y) == key)
                return 1;
            else if (arr.get(x).get(y) < key) {
                low = mid+1;
            } else {
                high = mid-1;
            }
        }
        return 0;
        
    }
}
