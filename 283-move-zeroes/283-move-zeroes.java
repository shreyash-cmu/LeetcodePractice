class Solution {
    public void moveZeroes(int[] nums) {
        List<Integer> nonzeroIdx = new ArrayList();
        for(int num:nums){
            if(num!=0){
                nonzeroIdx.add(num);
            }
        }
        //Collections.sort(nonzeroIdx);
        for(int i=0;i<nonzeroIdx.size();i++){
            nums[i] = nonzeroIdx.get(i);
        }
        //Arrays.stream(nums).forEach(System.out::println);
        for(int i=nonzeroIdx.size();i<nums.length;i++){
            nums[i] = 0;
        }
    }
}