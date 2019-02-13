public class Solution {
    public String countAndSay(int num) {
        String str = "11";
        if (num == 1)
            return "1";
        if (num ==2)
            return "11";
        StringBuffer res = new StringBuffer();
        num -= 2;
        while (num-- > 0) {
            res = new StringBuffer();
            int i = 1;
            int count = 1;
            while (i <= str.length()-1) {
                if (str.charAt(i-1) == str.charAt(i)) {
                    count++;
                    i++;
                } else {
                    int ch = str.charAt(i-1)-'0';
                    res.append(count);
                    res.append(ch);
                    count = 1;
                    i++;
                }
                
            }
            
            int ch = str.charAt(i-1)-'0';
            res.append(count);
            res.append(ch);
            
            str = res.toString();
        }
        return res.toString();
    }
}
