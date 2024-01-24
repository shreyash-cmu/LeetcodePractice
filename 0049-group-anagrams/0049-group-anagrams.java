class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            if(map.get(sortedWord)==null)
                map.put(sortedWord, new ArrayList<>());
            map.get(sortedWord).add(str);
        }
        List<List<String>> ret = new ArrayList<>();
        for(List<String> a: map.values()){
            ret.add(a);
        }
        return ret;
    }
}