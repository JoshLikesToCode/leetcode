class Solution {
    public int minimumCardPickup(int[] cards) {
        Map<Integer, Integer> cardByIdx = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for(int i = 0; i < cards.length; i++)
        {
            int card = cards[i];
            if(cardByIdx.containsKey(card))
                res = Math.min(res, i - cardByIdx.get(card) + 1);
            cardByIdx.put(card, i);
        }
        return (res != Integer.MAX_VALUE) ? res : -1;
    }
}




// class Solution {
//     public int minimumCardPickup(int[] cards) {
//         Map<Integer, Integer> cardFreq = new HashMap<>();
//         for(int i = 0; i < cards.length; i++)
//         {
//             int card = cards[i];
//             cardFreq.put(card, cardFreq.getOrDefault(card, 0) + 1);
//         }
//         int res = Integer.MAX_VALUE;
//         for(int i = 0; i < cards.length; i++)
//         {
//             int card = cards[i];
//             if(cardFreq.get(card) > 1)
//             {
//                 for(int j = i + 1; j < cards.length; j++)
//                 {
//                     if(cards[j] == card) // matching card found
//                     {
//                         res = Math.min(res, j - i + 1);
//                         break;
//                     }
//                 }
//                 cardFreq.put(card, cardFreq.get(card) - 1);
//             }
//         }
//         return (res != Integer.MAX_VALUE) ? res : -1;
//     }
// }