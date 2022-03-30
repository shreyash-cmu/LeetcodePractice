class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        //if the target is greater than i,j and less than i+1,j, we search in the ith row
        //if the target is less than 0,0 return false
        if(target<matrix[0][0]) return false;
        //binary search
        for(int i=0;i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(i+1>=matrix.length) break;
                if(target>= matrix[i][j] && target< matrix[i+1][j]){
                    return binarySearch(0, matrix[0].length-1, matrix[i], target);
                }else{
                    break;
                }
            }
        }
        return binarySearch(0, matrix[0].length-1, matrix[matrix.length-1], target);
    }
    boolean binarySearch(int left, int right, int[] matrix, int target){
        System.out.println(matrix[0]);
        while(left<=right){
            int mid = (left + right) /2;
            if(matrix[mid]==target){
                return true;
            }
            else if(matrix[mid]> target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return false;
    }
}