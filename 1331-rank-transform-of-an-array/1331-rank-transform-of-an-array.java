class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] ret = new int[arr.length];
        System.arraycopy(arr,0,ret,0,arr.length);
        Arrays.sort(ret);
        Map<Integer,Integer> map = new HashMap<>();
        int uniqueValues =1;
        for(int i =0;i<ret.length;i++){
            if(map.get(ret[i])==null){
                map.putIfAbsent(ret[i],uniqueValues++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}