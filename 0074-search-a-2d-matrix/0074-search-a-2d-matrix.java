class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; int m= matrix[0].length-1;int row=0;
        for(int i=0;i<n;i++){
            if(target>=matrix[i][0]&& target<=matrix[i][m]){
                row=i;
            }
        }
        for(int i=0;i<=m;i++){
            if(target==matrix[row][i]){
                return true;
            }
        }
        return false;
    }
}