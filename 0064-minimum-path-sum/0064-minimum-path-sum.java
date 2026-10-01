class Solution {
    public int minPathSum(int[][] nums) {
        int m= nums.length;
        int n= nums[0].length;
        
        for(int i=1;i<n;i++){
            nums[0][i]=nums[0][i]+nums[0][i-1];
        }
        for(int i=1;i<m;i++){
            nums[i][0]=nums[i][0]+nums[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                nums[i][j]=nums[i][j] + Math.min(nums[i-1][j],nums[i][j-1]);
            }
        }
        return nums[m-1][n-1];
    }
}