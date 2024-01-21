class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) return 0;
        int ans = 1;
        int start =0;
        int end =1;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(start));
        while(end < s.length()){
            System.out.println("");
            char curr = s.charAt(end);
            while(set.contains(curr)){
                set.remove(s.charAt(start++));
            }
            set.add(s.charAt(end++));
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
}