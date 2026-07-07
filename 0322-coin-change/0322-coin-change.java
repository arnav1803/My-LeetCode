    class Solution {
        public int coinChange(int[] nums, int k) {
            int n= nums.length;
            int dp[][]= new int [n+1][k+1];
            for(int j=1;j<=k;j++)
                dp[0][j]=Integer.MAX_VALUE-1;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=k;j++){
                    if(nums[i-1]<=j){
                        dp[i][j]=Math.min(1+dp[i][j-nums[i-1]],dp[i-1][j]);
                    }else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
            if(dp[n][k]==Integer.MAX_VALUE-1)
                 return -1;
            return dp[n][k];
        }
    }