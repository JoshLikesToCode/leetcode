class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder res = new StringBuilder();
        int X = 0;
        for(int shift : shifts)
            X = (X + shift) % 26; // if shift = [3,5,9], then X = 3,8,17 at each iteration
        
        for(int i = 0; i < s.length(); i++)
        {
            int idx = s.charAt(i) - 'a';
            res.append((char) ((idx + X) % 26 + 97));
            X = Math.floorMod(X - shifts[i], 26);
        }
        return res.toString();
    }
}

// class Solution {
//     public String shiftingLetters(String s, int[] shifts) {
//         String res = "";
//         char[] arr = s.toCharArray();
//         for(int i = 0; i < shifts.length; i++)
//         {
//             res = shift(arr, i + 1, shifts[i]);
//         }
//         return res;
//     }
    
//     public String shift(char[] arr, int upTo, int shifts)
//     {
//         for(int i = 0; i < upTo; i++)
//         {
//             char shiftChar = arr[i];
//             for(int j = 0; j < shifts; j++)
//             {
//                 shiftChar++;
//                 if(shiftChar > 'z')
//                     shiftChar = 'a';
//             }
//             arr[i] = shiftChar;
//         }
//         // System.out.println(String.valueOf(arr));
//         return String.valueOf(arr);
//     }
// }