class Solution {
    public int lengthOfLongestSubstring(String s) {
        // two pointers left and right at index 0
        //move right pointer until the set does not have char
        //on moving the left, check max_len
        Set<Character> set = new HashSet<>();
        if(s.length()==0)
            return 0;
        int max_len = 1;
        int left = 0;
        int right = 1;
        set.add(s.charAt(left));
        while(right<s.length()){
            if(set.contains(s.charAt(right))){
                
                max_len = Math.max(max_len,set.size());
                set.remove(s.charAt(left));
                left++;
            }else{
                set.add(s.charAt(right));
                right++;
            }
        }
        return Math.max(max_len,set.size());
    }
}