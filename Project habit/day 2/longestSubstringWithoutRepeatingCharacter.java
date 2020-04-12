// 3. Longest Substring Without Repeating Characters
class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        int s = 0, len = 0;
        int i = 0;
        for (; i < str.length(); i++ ) {
            if(map.containsKey(str.charAt(i)) && map.get(str.charAt(i)) >= s) {
                if(i - s > len)
                    len = i - s;
                s = map.get(str.charAt(i)) + 1;
            }
            map.put(str.charAt(i), i);
        }
        if(i - s > len)
            len = i - s;
        return len;
    }
}