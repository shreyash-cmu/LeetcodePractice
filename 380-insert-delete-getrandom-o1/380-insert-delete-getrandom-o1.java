class RandomizedSet {
    HashMap<Integer,Integer> map;
    List<Integer> list;
    Random r;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        r= new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) return false;
        int id = list.size();
        map.put(val, id);
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
        int id = map.get(val);
        int lastValue = list.get(list.size()-1);
        list.set(id,lastValue);
        map.put(lastValue,id);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int rand = r.nextInt(list.size());
        return list.get(rand);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */