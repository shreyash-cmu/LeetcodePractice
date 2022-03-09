class Solution {
    
    /**
        Process the input into stack A upto index i,
        For each element, 
        1. pop elements from Stack A and push to B and update Min,MAX variable
        2. add to the sum, min
        3. move elements from B to A.
        Stack A: {1,2,3}
        Stack B: {}
        min = 1;
        max = 2;
        sum += max - min;
    
    
    **/
    public long subArrayRanges(int[] nums) {
        long sum =0;
        Stack<Integer> a = new Stack();
        Stack<Integer> b = new Stack();
        for(int i=0;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            a.push(nums[i]);
            while(!a.isEmpty()){
                int polled = a.pop();
                min = Math.min(min, polled);
                max = Math.max(max, polled);
                sum += max-min;
                b.push(polled);
            }
            while(!b.isEmpty()){
                a.push(b.pop());
            }
        }
        return sum;
    }
}