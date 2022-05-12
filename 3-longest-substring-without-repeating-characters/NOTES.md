This problem can be solved using the sliding window technique. When we come across a repeated character, we start to slide our window, keeping track of the max length of our window as we do so. 

For instance, for string "abcdeak" our window starts at |a|bcdeak -> |ab|cdeak -> |abc|deak -> |abcd|eak -> |abcde|ak -> a|bcdea|k -> a|bcdeak|
which gives us a final max window length of 6. As you can see, the window only begins to slide to the left once a repeated character is found. In this instance, a is the first repeated character found in the string and the initial point where we begin to slide the window. 

The main data structure involved with this problem is a HashMap which we use to keep track of characters (the key in the HashMap) and their positions (the value in the HashMap) in the string. We know that if our HashMap contains a character already, then we've found a repeated character and need to update that character's index and begin sliding our window.

Our algorithm is O(N) where N is the length of characters in the string we're checking.
