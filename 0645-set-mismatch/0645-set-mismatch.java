class Solution {
    public int[] findErrorNums(int[] nums) {
        int repeatedNum = 0;
        Set<Integer> set = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                repeatedNum = num;
            }
            set.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                return new int[]{repeatedNum,i};
            }
        }
        return new int[2];
        
    }
}