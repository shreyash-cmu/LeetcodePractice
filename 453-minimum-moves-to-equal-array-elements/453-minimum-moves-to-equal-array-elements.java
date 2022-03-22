class Solution {
    
    
    /*
    currently how many up moves have been done on the array
    
    [1,2,4,6]
    []
    [6,7,9,6]
    [9,10,9,9]
    [10, 10, 10, 10]
    
    
    for(int i=n; i>=0; i--){
    lowest = arr[(i+1)%n];
    if(cumm+arr[i]>lowest) {arr[i]= arr[i]+cumm; cumm += arr[i]-lowest;}
    }
    else return cumm;
    
    
    */
    
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            count += nums[i] - nums[0];
        }
        return count;
        
    }
}