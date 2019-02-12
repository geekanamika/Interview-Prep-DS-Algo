public class Solution {
    class MyComp implements Comparator<String> {
        public int compare (String a, String b) {
            // String sa = a+b;
            // String sb = b+a;
            return (a+b).compareTo((b+a)) > 0 ? -1 : 1;
        }
    }
    
    public String largestNumber(final int[] arr) {
        String[] str = new String[arr.length];
        boolean flag = false;
        int j = 0;
        for (int i : arr)
        {
            if (!flag && i > 0) {
                flag = true;
            }
            str[j] = ""+i;
            j++;
        }
        if(!flag)
            return "0";
        Arrays.sort(str, new MyComp());
        StringBuffer sb = new StringBuffer();
        for (String a : str){
            sb.append(a);
        }
        return sb.toString();
    }
}
