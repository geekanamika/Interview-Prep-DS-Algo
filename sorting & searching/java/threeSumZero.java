public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(ArrayList<Integer> arr) {
        if (arr.size() < 3)
            return new ArrayList<ArrayList<Integer>>() ;
        // sort the array
        Collections.sort(arr);
        Set<String> s = new HashSet<String>();
        // keep a pointer from i = 0 to arr.length() - 2
        int i = 0;
        int n = arr.size();
        int low , high;
        int currSum;
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        //int count = 0;
        while (i < (n-2)) {
            
            low = i+1;
            high = n-1;
            currSum = arr.get(i);
            currSum = -currSum;
            while (low < high) {
                if((arr.get(low) + arr.get(high)) == currSum) {
                    StringBuffer sb = new StringBuffer();
                    currSum = -currSum;
                    sb.append(""+currSum);
                    sb.append(""+arr.get(low));
                    sb.append(""+arr.get(high));
                    String sTemp = sb.toString();
                    if (!s.contains(sTemp)) {
                        s.add(sTemp);
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(-currSum);
                        temp.add(arr.get(low));
                        temp.add(arr.get(high));
                        res.add(temp);
                    }
                    low++;
                    currSum = -currSum;
                    //count++;
                } else if ((arr.get(low) + arr.get(high)) < currSum) {
                    low++;
                } else {
                    high--;
                }
            }
            i++;
        }
        return res;
    }
}
