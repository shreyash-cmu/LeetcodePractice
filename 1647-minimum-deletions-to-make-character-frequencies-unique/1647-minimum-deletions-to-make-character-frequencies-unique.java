class Solution {
    public int minDeletions(String s) {
        int ret =0;
        Map<Character,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Character c: map.keySet()){
            int freq = map.get(c);
            if(set.contains(freq)){
                while(freq>0){
                    freq--;
                    ret++;
                    if(!set.contains(freq)) break;
                }
            }
            set.add(freq);
        }
        return ret;
    }
}