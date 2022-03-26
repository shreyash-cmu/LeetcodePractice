class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        /*
            Map to store the freq and domain.
            Break the string into two parts on space delimitor.
            Break the second string into x parts as . delim.
            then add the freq into the map.
        
        */
        Map<String,Integer> map = new HashMap<>();
        for(String site: cpdomains){
            String[] firstBreak = site.split(" ");
            int count = Integer.parseInt(firstBreak[0]);
            buildMap(count, firstBreak[1], map);
        }
        List<String> ret = new ArrayList<>();
        for(String dom: map.keySet()){
            String entry = map.get(dom) + " "+ dom;
            ret.add(entry);
        }
        return ret;
    }
    void buildMap(int freq, String domain, Map<String,Integer> map){
        String[] subdomains = domain.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i= subdomains.length-1;i>=0;i--){
            if(!sb.isEmpty()){
                sb.insert(0, ".");
            }
            sb.insert(0,subdomains[i]);
            map.put(sb.toString(), map.getOrDefault(sb.toString(),0)+freq);
        }
    }
}