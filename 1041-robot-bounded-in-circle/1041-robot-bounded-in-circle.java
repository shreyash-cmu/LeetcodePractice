class Solution {
    public boolean isRobotBounded(String instructions) {
        int x =0;
        int y=0;
        //0.north, 1. west 2. south, 3.east
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int direction = 0;
        for(char c: instructions.toCharArray()){
            if(c == 'L'){
                direction = (direction+3)%4;
            } 
            if(c == 'R'){
                direction = (direction+1) %4;
            }
            if(c == 'G'){
                x += dir[direction][0];
                y += dir[direction][1];
            }
        }
        //If the robot is at origin or it is facing the same direction
        return (x==0 && y==0) || (direction!=0);
    }
}