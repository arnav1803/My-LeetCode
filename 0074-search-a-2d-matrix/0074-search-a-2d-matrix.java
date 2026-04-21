class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length; int m= matrix[0].length-1;int row=0;
        for(int i=0;i<n;i++){
            if(target>=matrix[i][0]&&target<=matrix[i][m]){
                row=i;
                break;
            }
        }
        int low=0;int high=m;

        while(low<=high){
            int mid=low+(high-low)/2;
            if (matrix[row][mid]==target) {
                return true;}
            else if(target<matrix[row][mid]){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return false;
    }
}