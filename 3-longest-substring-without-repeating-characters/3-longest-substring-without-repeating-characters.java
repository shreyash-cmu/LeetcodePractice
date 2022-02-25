class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen =0;
        Set<Character> set = new HashSet<>();
        Queue<Character> queue = new LinkedList<>();
        for(char c: s.toCharArray()){
            if(set.contains(c)){
                while(queue.peek() != c){
                    char d = queue.poll();
                    set.remove(d);
                }
                set.remove(queue.poll());
            }
            set.add(c);
            queue.add(c);
            maxLen = Math.max(maxLen,queue.size());
            
        }
        return maxLen;
    }
}