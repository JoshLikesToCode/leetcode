class Solution 
{
	public String longestPalindrome(String s)
	{
        String max = "";
        int length = s.length();
        
        for(int i = 0; i < length; i++)
		{
            String s1 = extendPalindrome(s, i, i, length);			// Extend assuming the length of Longest Palindromic Substring is odd
			String s2 = extendPalindrome(s, i, i + 1, length);		// Extend assuming the length of Longest Palindromic Substring is even

            if(s1.length() > max.length()) 
                max = s1;
            if(s2.length() > max.length()) 
                max = s2;
        }
        return max;
    }
	
    private String extendPalindrome(String s, int start, int end, int length)
	{
        while(start >= 0 && end < length && s.charAt(start) == s.charAt(end))
		{
            start--;
			end++;
        }
        return s.substring(start + 1, end);
	}
}