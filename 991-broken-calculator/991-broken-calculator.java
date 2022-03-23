class Solution {
    public int brokenCalc(int startValue, int target) {
        int count =0;
        while(true){
            if(startValue>target){
                count += Math.abs(startValue-target);
                break;
            }
            if(startValue==target) break;
            
            if(target%2!=0){
                count++;
                target +=1;
            } 
            target = target/2;
            count++;
            
            
        }
        return count;
        
        /*
        Two cases : 
        1. the startValue is less than target:
        2. the startValue is more than target.
        
        
        If it is more than target
        
        */
       
        
        
    }
}