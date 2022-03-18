class Solution {
    public int minMeetingRooms(int[][] intervals) {
        /*
        
        */
        int max = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        for(int i = 0;i<intervals.length;i++){
            if(pq.isEmpty()){
                pq.offer(intervals[i][1]);
            }
            else{
                int latestAvailableTime = pq.peek();
                if(latestAvailableTime<= intervals[i][0]){
                    pq.poll();
                }
                pq.offer(intervals[i][1]);
            }
            max = Math.max(max, pq.size());
        }
        return max;
    }
}