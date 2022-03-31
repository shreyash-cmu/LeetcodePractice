class Solution {
    public int numberOfRounds(String loginTime, String logoutTime) {
        /*
            hh1:mm1, hh2:mm2 format
            if hh2< hh1 :
                (hh2 %12  + hh1%12) *60
            else:
                (hh2 - hh1 %12) *60
                
            add the minutes into total:
            mm1 + mm2 + prevresult
            divide it by 15 to get the final number
        */
        int start = toMinutes(loginTime);
        int end = toMinutes(logoutTime);
        
        int roundedStart = toNextQuarter(start);
        int roundedEnd = toPreviousQuarter(end);
        
        if (start < end) {
            return Math.max(0, (roundedEnd - roundedStart) / 15);
        }
        
        return ((roundedEnd+ 24 * 60) - roundedStart ) / 15;
    }
    
    public static int toMinutes(String s) {
        return Integer.parseInt(s.substring(0, 2)) * 60
            + Integer.parseInt(s.substring(3, 5));
    }
    
    public static int toNextQuarter(int time) {
        return ((time + 14) / 15) * 15;
    }

    public static int toPreviousQuarter(int time) {
        return (time / 15) * 15;
    }
}