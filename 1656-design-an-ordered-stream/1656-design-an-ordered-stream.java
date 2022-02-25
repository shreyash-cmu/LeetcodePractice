class OrderedStream {
    
    Map<Integer,String> orderedStream;
    boolean[] returned;

    public OrderedStream(int n) {
        orderedStream = new HashMap(n);
        returned = new boolean[n+1];
    }
    
    public List<String> insert(int idKey, String value) {
        orderedStream.put(idKey,value);
        
        
        if(idKey>1 && returned[idKey-1]==false) return new ArrayList<String>();
        
        ArrayList<String> ret = new ArrayList();
        ret.add(value);
        returned[idKey] = true;
        
        
        for(int i= idKey+1; i< returned.length;i++){
            if(orderedStream.containsKey(i) && returned[i]== false){
                ret.add(orderedStream.get(i));
                returned[i] = true;
            }else{
                break;
            }
        }
        return ret;
        
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */