class Solution {
    public int[][] highFive(int[][] items) {
        /*
            Create a HashMap of Student ID and record their times in an array list.
            Sort the arraylist and calculate the average of top 5 scores. 
            Return it in array list.
        */
        //ArrayList<int[]> ret = new ArrayList<int[]>();
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        for (int i =0; i<items.length;i++){
            map.putIfAbsent(items[i][0], new ArrayList<Integer>());
            map.get(items[i][0]).add(items[i][1]);
        }
        int[][] ret = new int[map.size()][2];
        int idx = 0;
        for(int i: map.keySet()){
            Collections.sort(map.get(i), Collections.reverseOrder());
            int sum = 0;
            for(int j=0; j<5;j++){
                sum += map.get(i).get(j);
            }
            sum /= 5;
            ret[idx][0] =i;
            ret[idx++][1]=sum;
            //ret.add(new int[]{i,sum});
        }
        return ret;
    }
}