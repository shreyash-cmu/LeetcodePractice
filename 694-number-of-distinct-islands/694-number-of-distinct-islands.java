class Solution {
    Map<Integer, List<Pair<Integer,Integer>>> map = new HashMap<>();
    public int numDistinctIslands(int[][] grid) {
        int count =0;
        
        for(int i=0; i< grid.length;i++){
            for(int j=0 ;j<grid[0].length;j++){
                if(grid[i][j]==1){
                   dfs(i,j,0,0,grid,count++);
                }
            }
        }
     
        Set<String> set = new HashSet<>();
        for(Map.Entry<Integer, List<Pair<Integer, Integer>>> e: map.entrySet())
        { 
            Collections.sort(e.getValue(), (p1, p2)-> p1.getKey()==p2.getKey()?p1.getValue()-p2.getValue():p1.getKey()-p2.getKey());
            set.add(e.getValue().toString());}
        
        
        return set.size();
    }
    public void dfs(int i, int j, int start, int end,int[][] grid, int island){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length|| grid[i][j]==0) return;
      
        map.putIfAbsent(island, new ArrayList<Pair<Integer,Integer>>());
      
        Pair<Integer,Integer> coordinates = new Pair<>(start,end);
        map.get(island).add(coordinates);
        grid[i][j]=0;
        dfs(i+1,j,start+1,end,grid,island);
        dfs(i-1,j,start-1,end,grid,island);
        dfs(i,j+1,start,end-1,grid,island);
        dfs(i,j-1,start,end+1,grid,island);
    }
}