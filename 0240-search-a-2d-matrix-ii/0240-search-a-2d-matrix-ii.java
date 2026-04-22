class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; int m=matrix[0].length-1;
        int row=0;int col=m;
            while(row<n && col>=0){
                if(target==matrix[row][col]){
                    return true;
                }
                else if(target>matrix[row][col]){
                    row++;
                    col=m;
                }
                else{
                    col--;
                }
            }
            return false;
    }
}