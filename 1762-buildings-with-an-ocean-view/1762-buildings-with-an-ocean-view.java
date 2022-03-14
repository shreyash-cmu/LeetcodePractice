class Solution {
    public int[] findBuildings(int[] heights) {
        
        int n = heights.length;
        int maxHeight = heights[n-1];
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(n-1);
        for(int i= n-2;i>=0;i--){
            if(heights[i]> maxHeight){
                ret.add(i);
                maxHeight = heights[i];
            }
        }
        
        
        int idx = 0;
        int[] retu = new int[ret.size()];
        for(int i= ret.size()-1;i>=0;i--){
            retu[idx++] = ret.get(i);
        }
        return retu;
    }
}