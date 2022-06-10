class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        Map<Character, Integer> freqMap = new HashMap<>();
        int start = 0, res = 0;
        for(int i = 0; i < length; i++)
        {
            char c = s.charAt(i);
            if(freqMap.containsKey(c))
                start = Math.max(start, freqMap.get(c) + 1);
            freqMap.put(c, i);
            res = Math.max(res, i - start + 1);
        }
        return res;
    }
}