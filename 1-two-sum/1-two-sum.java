class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        Map<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int toFind = target - nums[i];
            if(!hashMap.containsKey(toFind)){
                hashMap.put(nums[i],i);
            }else{
                ret[0] = hashMap.get(toFind);
                ret[1] = i;
                return ret;
            }
        }
        return ret;
    }
}