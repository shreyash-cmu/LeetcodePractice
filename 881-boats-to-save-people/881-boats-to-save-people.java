class Solution {
    public int numRescueBoats(int[] people, int limit) {
        /*
            1 arrays: visited[]
            sort the array
            iterate from last:
            mark visited
            look for next availa
        
        */
        Arrays.sort(people);
       int heavy = people.length-1;
        int light =0;
        int ctr =0;
        while(light<=heavy){
            if(people[light]+ people[heavy]<=limit){
                heavy--;
                light++;
                
            }else{
                heavy--;
            }
            ctr++;
        }
        return ctr;
    }
}