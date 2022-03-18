class UndergroundSystem {
    /*
        Requirements:
            1. return avg time between any two stations.
            2. Boarding store(CUstomer ID, Station Name, boarding time).
            3. 
            
    
    */
    class Traveller{
        int id;
        String stationName;
        int time;
        Traveller(int id, String stationName, int time){
            this.id = id;
            this.stationName = stationName;
            this.time = time;
        }
    }
    Map<Integer, Traveller> map;
    Map<String, Double> avgTime;
    Map<String, Integer> travelFreq;
    public UndergroundSystem() {
        map = new HashMap<>();
        avgTime = new HashMap<>();
        travelFreq = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        Traveller newT = new Traveller(id,stationName,t);
        map.put(id, newT);
    }
    
    public void checkOut(int id, String stationName, int t) {
        Traveller origin = map.get(id);
        if(origin !=null){
            StringBuilder sb = new StringBuilder();
        sb.append(origin.stationName);
            sb.append(" ");
        sb.append(stationName);
        int durationTime = t - origin.time;
        String key = sb.toString();
        int freq = travelFreq.getOrDefault(key,0);
        double currentAvg = avgTime.getOrDefault(key,0.00);
        double newAvg = ((currentAvg*freq) + durationTime) / ++freq;
        travelFreq.put(key, freq);
        avgTime.put(key, newAvg);
        map.remove(id);
        }
        
        }
    
    public double getAverageTime(String startStation, String endStation) {
        StringBuilder sb = new StringBuilder();
        sb.append(startStation);
        sb.append(" ");
        sb.append(endStation);
        String key = sb.toString();
        return avgTime.getOrDefault(key,0.00);
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */