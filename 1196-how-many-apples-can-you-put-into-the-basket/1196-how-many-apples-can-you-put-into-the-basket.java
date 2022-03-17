class Solution {
    public int maxNumberOfApples(int[] weight) {
        Arrays.sort(weight);
        int sum = weight[0];
        for(int i=1;i<weight.length;i++){
            sum += weight[i];
            if(sum>5000){
                return i;
            }
        }
        return weight.length;
    }
}