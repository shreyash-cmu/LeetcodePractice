class Solution {
    class Pair{
        int hour;
        int visits;
        public Pair(int hour, int visits){
            this.hour =hour;
            this.visits = visits;
        }
    }
    public List<String> alertNames(String[] keyName, String[] keyTime) {
        /*
        Map to store user, and hour,entry PAir.
        if the minute stamp is 00, we add hh-1 into the map.
        Pick up each user if a pair exists with entry 3, add the user to list<string>,
        sort list and return
        
        
        
        */
        List<String> ret = new ArrayList<>();
        Map<String,List<Integer>> map = new HashMap<>();
        for(int i=0; i<keyName.length;i++){
            boolean flag = false;
            int time  = getTime(keyTime[i]);
            map.putIfAbsent(keyName[i], new ArrayList<Integer>());
            map.get(keyName[i]).add(time);
        }
        for(String key: map.keySet()){
            List<Integer> l = map.get(key);
            Collections.sort(l);
            for(int i=2;i<l.size();i++){
                if(l.get(i) - l.get(i-2) <= 60){
                    ret.add(key);
                    break;
                }
            }
        }if(ret.size()>1){
            Collections.sort(ret);
        }
        
        return ret;
    }
    public int getTime(String time){
        String[] times = time.split(":");
        return Integer.parseInt(times[1]) + 60*Integer.parseInt(times[0]);
    }
}