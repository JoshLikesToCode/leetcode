class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int res = 0;
        int length = s.length();
        Map<Character, Integer> charByLastIdx = new HashMap<>();
        for(int i = 0; i < length; i++)
        {
            Character c = s.charAt(i);
            if(charByLastIdx.containsKey(c))
                start = Math.max(start, charByLastIdx.get(c) + 1);
            charByLastIdx.put(c, i);
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}