class Solution {
    public void wiggleSort(int[] nums) {
        if(nums.length==1) return;
        boolean bigger = true;
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        int idx = 0;
        while(++idx <nums.length){
            if(bigger){
                if(nums[idx]>= stack.peek()){
                    stack.push(nums[idx]);
                }else{
                    int val = stack.pop();
                    stack.push(nums[idx]);
                    stack.push(val);
                }
                bigger = false;
            }else{
                if(nums[idx]<= stack.peek()){
                    stack.push(nums[idx]);
                }else{
                    int val = stack.pop();
                    stack.push(nums[idx]);
                    stack.push(val);
                }
                bigger = true;
            }
        }
        for(int i= nums.length-1;i>=0;i--){
            nums[i] = stack.pop();
        }
    }
}