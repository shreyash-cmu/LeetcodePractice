class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int num: arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a,b)->a[1]-b[1]);
        for(int num: freq.keySet()){
            pq.offer(new int[]{num, freq.get(num)});
        }
        for(int[] num: pq){
            //System.out.println("Num"+ num[0] + "Val"+ num[1]);
        }
        while(k>0){
            int val = pq.poll()[1];
            //System.out.println(val);
            k = k-val;
            if(k<0){
                pq.offer(new int[]{0,Math.abs(k)});
            }
        }
        return pq.size();
    }
}