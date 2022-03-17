class Solution {
    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new LinkedHashMap();
        for(Character c: s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for(Character c: order.toCharArray()){
            if(map.containsKey(c)){
                for(int i=0; i< map.get(c);i++) sb.append(c);
                map.remove(c);
            }
        }
        for(Character c: map.keySet()){
            for(int i=0; i< map.get(c);i++) sb.append(c);
        }
        return sb.toString();
    }
}