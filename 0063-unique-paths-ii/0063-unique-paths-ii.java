class Solution {
    public int uniquePathsWithObstacles(int[][] nums) {
        int m= nums.length;
        int n=nums[0].length;
        if(nums[0][0]==1||nums[m-1][n-1]==1) return 0;
        int dp[][]= new int [m][n];
        dp[0][0]=1;
        for(int j=1;j<n;j++){
            dp[0][j]=(nums[0][j]==1)?0:dp[0][j-1];
        }
        for(int i=1;i<m;i++){
            dp[i][0]=(nums[i][0]==1)?0:dp[i-1][0];
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=(nums[i][j]==1)?0:dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}