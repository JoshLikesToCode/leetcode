
// TLE SOLUTION
// class Solution {
//     Set<String> hs = new HashSet<>();
//     public boolean canPermutePalindrome(String s) {
//         findAllPerms(s);
//         for(String str : hs)
//         {
//             StringBuilder sb = new StringBuilder(str);
//             if(sb.toString().equals(sb.reverse().toString()))
//                 return true;
//         }
//         return false;
//     }
    
//     public void swap(char[] charArr, int a, int b)
//     {
//         char tmp = charArr[a];
//         charArr[a] = charArr[b];
//         charArr[b] = tmp;
//     }
    
//     public void findAllPerms(String str) {
 
//         // base case
//         if (str == null || str.length() == 0) {
//             return;
//         }
 
//         generateAllPerms(str.toCharArray(), 0, str.length());
//     }
    
//     public void generateAllPerms(char[] sArr, int pos, int length)
//     {
//         if(pos == length - 1)
//             hs.add(new String(sArr));
//         for(int i = pos; i < length; i++)
//         {
//             swap(sArr, pos, i);
//             generateAllPerms(sArr, pos + 1, length);
//             swap(sArr, pos, i);
//         }
//     }
// }

public class Solution {
 public boolean canPermutePalindrome(String s) {
     HashMap < Character, Integer > map = new HashMap < > ();
     for (int i = 0; i < s.length(); i++) {
         map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
     }
     int count = 0;
     for (char key: map.keySet()) {
         count += map.get(key) % 2;
     }
     return count <= 1;
 }
}
