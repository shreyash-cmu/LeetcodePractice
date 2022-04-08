class Solution {
    public int findKthPositive(int[] arr, int k) {
        /*
            counter =1 
            gap between counter and each element;
            if the k lies between the gap, find and return
        
        */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num:arr){
            pq.offer(num);
        }
        int startNum =0;
        while(k>0&& !pq.isEmpty()){
            int currValue = pq.poll();
            int diff = currValue - startNum;
            if(diff>1 && diff>k){
                return startNum+k;
            }else if(diff>1){
                k = k-diff+1;
            }
            startNum = currValue;
        }
        return k>0?startNum+k:startNum;
    }
}