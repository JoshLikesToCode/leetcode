class Solution {
    public boolean digitCount(String num) {
        if (num.length()==1 && num.charAt(0)!='0')
            return false; 
        Map <Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0; i < num.length(); i++){
            int ch = Character.getNumericValue(num.charAt(i));
            if (map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }
        
        for(int i=0;i<num.length();i++){
            int val=0;
            int ch = Character.getNumericValue(num.charAt(i)); 
            if (map.containsKey(i))
                val=map.get(i);
            if (val!=ch)
                return false;
                
    }
        return true;
}
}