class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> set = new HashMap<>();
        for(char c:s.toCharArray()){
            set.put(c,set.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            if(!set.containsKey(c))
                return false;
            set.put(c,set.get(c)-1);
        }
        for(char c:set.keySet()){
            if(set.get(c)!=0)
                return false;
        }
        return true;
    }
}