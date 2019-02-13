public class Solution {
    public int solve(String str) {
        int count = 0, cs = 0;
        int i=0, n = str.length()-1;
        int j = n;
        boolean flag = false;
        while (i>= 0 && j>= 0 && i!=j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else{
                i = 0;
                n--;
                j = n;
                count++;
            }
        }
        // if (count < cs && !flag)
        //     count = cs;
        return count;
    }
}
