class Solution {
    public int maxChunksToSorted(int[] arr) {
        /*Chaining Technique to measure the impact of largest element till the index*/
        int max = Integer.MIN_VALUE;
        int chunks =0;
        for(int i=0;i<arr.length;i++){
            max= Math.max(max,arr[i]);
            if(max==i) chunks++;
        }
        return chunks;
    }
}