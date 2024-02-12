class Solution {
    public int majorityElement(int[] nums) {
        int max = nums.length / 2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key: map.keySet()){
            if(map.get(key)>max){
                return key;
            }
        }
        return -1;
    }
}