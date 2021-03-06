class Solution {    
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for(Character c : s.toCharArray())
        {
            if(hm.containsKey(c))
            {
                int val = hm.get(c) + 1;
                hm.put(c, val);
            }
            else
            {
                hm.put(c, 1);
            }
        }
        List<Character> list = new ArrayList(hm.keySet());
        Collections.sort(list, (a, b) -> hm.get(b) - hm.get(a));
        String answer = "";
        for(Character c : list)
        {
            int val = hm.get(c);
            for(int i = 0; i < val; i++)
                answer += c;
        }
        
        return answer;
    }
}
