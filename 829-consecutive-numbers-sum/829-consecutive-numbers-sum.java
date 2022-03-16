class Solution {
    public int consecutiveNumbersSum(int n) {
        /*if(n==1||n==2) return 1;
        int start = 1;
        int m = n/2 + 1;
        int runningSum =0;
        int ansCnt =0;
        for(int i=1;i<=m;i++){
            runningSum += i;
            if(runningSum==n){
                ansCnt++;
                runningSum -= start++;
            }else if(runningSum > n){
                while(runningSum > n){
                    runningSum -= start++;
                }
                
                if(runningSum==n) ansCnt++;
            }
            
        }
        return ansCnt+1;*/
        /*
            runningSum = N;
            keep on subtracting i in range (1, rootn) form the runningSum;
            if runningSum % i ===0 then incresase count
            
            runningsSum = 10 - 
            i = 1
            
            
            runningSum = 7  
            
            
        
        */
        int ans=0;
        int windowSize=1;
        boolean isWindowSizePossible=true;
        int runningSum=0;
        int i=0;
        while(runningSum<=n){
            runningSum +=i++;
            int temp= n-runningSum;
            if(temp !=0 && temp%windowSize==0){
            ans++;
            }
            windowSize++;
           
            
        }
        return ans;
    }
}