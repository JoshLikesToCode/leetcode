public class Solution {
    public bool IsPowerOfFour(int n) {
        return (n > 0) && (Math.Log(n) / Math.Log(2) % 2 == 0);
    }
}