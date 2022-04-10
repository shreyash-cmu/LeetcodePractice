class Solution {
    int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
    int cleanedSpaces;
    int direction = 0;
    public int numberOfCleanRooms(int[][] room) {
        dfs(0,0,room,new HashSet<String>(), new HashSet<String>());
        return cleanedSpaces;
    }
    int dfs(int i, int j, int[][] matrix, Set<String> visited,Set<String> coordinates){
        
        if(i<0||j<0||i>=matrix.length||j>=matrix[0].length||matrix[i][j]==1){
            direction = (direction + 1) % 4;
            return -1;
        }
        
       String s = i+", "+j;
        if(!coordinates.contains(s)){
            //System.out.println(s);
            cleanedSpaces++;
        }
        coordinates.add(s);
        s = s + " :" + direction;
        if(visited.contains(s)){
            return 0;
        }
        visited.add(s);
        int count =0;
      while(count<4 && dfs(i+dir[direction][0],j+dir[direction][1],matrix,visited,coordinates)==-1){
          count++;
      }
        return 1;
        
        
    }
    
    
}