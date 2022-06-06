class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String res = "";
        int i = -1;
        for(String word : words)
        {
            i++;
            if(word.length() <= 2)
                res += word.toLowerCase();
            else
            {
                StringBuilder sb = new StringBuilder(word.toLowerCase());
                char firstChar = Character.toUpperCase(word.charAt(0));
                sb.setCharAt(0, firstChar);
                res += sb.toString();
            }
            if(i != words.length - 1)
                res += " ";
        }
        return res;
    }
}