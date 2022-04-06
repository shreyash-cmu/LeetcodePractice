class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]==0?a[1]-b[1]:a[0]-b[0]);
        for(int i=1;i<intervals.length;i++){
            int endTime = intervals[i-1][1];
            int startTime = intervals[i][0];
            if(endTime>startTime) return false;
        }
        return true;
    }
}