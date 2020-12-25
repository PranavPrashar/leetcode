class Solution {
    public int lengthOfLongestSubstring(String s) {
        int stringSize = s.length();
        int counter = 0;
        int i =0;
        int j = 0;
        
        
        
        Set<Character> set = new HashSet<>();
        
        while(i < stringSize && j < stringSize){
            if(!set.contains(s.charAt(j))){// if the element is not in the set then we should add to set.
                set.add(s.charAt(j++));
                counter = Math.max(counter, j-i);
            }
            else{// if the set does contain the element then it will come to the if statment and should be removed cause this is no longer the longest substring
                set.remove(s.charAt(i++));
            }
        }
        return counter;
    }

}
// Given a string s, find the length of the longest substring without repeating characters.

// intput s= abcabcabc
// ouput = 3

//input = pwwkew
// output = 3 as kew is the longest string