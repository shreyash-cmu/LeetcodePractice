class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ret = new int[length];
        for(int i =0;i<updates.length;i++){
            ret[updates[i][1]] += updates[i][2];
            if(updates[i][0]>0){
                ret[updates[i][0]-1] -= updates[i][2];
            }
        }
        for(int i=length-2;i>=0;i--){
            ret[i] += ret[i+1];
        }
        return ret;
    }
}