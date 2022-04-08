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
            //System.out.println("CurrentVal: "+ currValue + " diff "+ diff);
            if(diff>1 && diff>k){
                while(k>0){
                    startNum++;
                    k--;
                }
                return startNum;
            }else if(diff>1){
                k = k-diff+1;
            }
            //System.out.println("KVal "+ k);
            startNum = currValue;
        }
        while(k>0){
            startNum++;
            k--;
        }
        return startNum;
    }
}