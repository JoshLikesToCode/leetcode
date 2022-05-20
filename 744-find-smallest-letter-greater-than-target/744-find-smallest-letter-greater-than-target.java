class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if(target >= letters[letters.length - 1])
            return letters[0]; 
        int lo = 0;
        int hi = letters.length;
        int mid = 0;
        while(lo <= hi)
        {
            mid = lo + (hi - lo) / 2;
            if(letters[mid] > target && mid > 0 && letters[mid - 1] <= target)
                break;
            else if(letters[mid] > target)
                hi = mid - 1;
            else
                lo = mid + 1;
        }
        return letters[mid];
    }
}