class Solution {
    public int[] sumZero(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        if(n%2!=0){
            ret.add(0);
            n=n-1;
        }
        helper(n, ret);
        int[] arr = new int[ret.size()];
        int idx=0;
        for(int num:ret){
            arr[idx++]= num;
        }
        return arr;
    }
    void helper(int n,List<Integer> levels){
        if(n==0){
            return;
        }
        levels.add(n*-1);
        levels.add(n);
        n -=2;
        helper(n, levels);
    }
}