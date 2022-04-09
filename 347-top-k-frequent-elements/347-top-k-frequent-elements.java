class Solution {
    class Pair{
        int num; int freq;
        public Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((a,b)-> a.freq - b.freq);
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            pq.offer(new Pair(e.getKey(),e.getValue()));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] ret = new int[k];
        int idx=0;
        while(!pq.isEmpty()){
            ret[idx++]=pq.poll().num;
        }
        return ret;
    }
}