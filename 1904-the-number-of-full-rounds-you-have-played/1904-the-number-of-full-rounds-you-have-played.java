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
        
        int totalMinutes = 0;
        int hh1 = Integer.parseInt(loginTime.substring(0,loginTime.indexOf(":")));
        int mm1 = Integer.parseInt(loginTime.substring(loginTime.indexOf(":")+1));
        int hh2 = Integer.parseInt(logoutTime.substring(0,logoutTime.indexOf(":")));
        int mm2 = Integer.parseInt(logoutTime.substring(logoutTime.indexOf(":")+1));
        if(hh2<hh1){
            int loginHrs = 24 - hh1;
            totalMinutes =  (hh2+loginHrs)*60;
        }else if( hh1 == hh2 && mm1>mm2){
            totalMinutes += (24*60);
        }
        
        else{
            totalMinutes += ((hh2 -hh1) *60);
        }
        if(mm1%15!=0){
            
            mm1 += (15-(mm1%15));
        }
        
        if(mm2%15!=0){
            
            mm2 -= (mm2%15);
        }
        
        totalMinutes += mm2;
        totalMinutes -= mm1;
        return totalMinutes/15>0?totalMinutes/15:0;
    }
}