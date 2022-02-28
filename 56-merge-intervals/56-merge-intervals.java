class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]==0? b[1]-a[1]:a[0]-b[0]);
        //System.out.println(Arrays.deepToString(intervals));
        int[] maxInterval = intervals[0]; 
        List<int[]> ret = new ArrayList();
        ret.add(maxInterval);
        for(int[] interval :intervals){
            if(interval[0]<= maxInterval[1]){
                maxInterval[1] = Math.max(maxInterval[1], interval[1]);
            }
            else{
                maxInterval = interval;
                ret.add(maxInterval);
            }
        }
        return ret.toArray(new int[ret.size()][]);
    }
}