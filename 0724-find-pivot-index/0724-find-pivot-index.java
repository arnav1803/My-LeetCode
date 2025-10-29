class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length; int sum=0;
        int [] pre=new int[n];
        int [] suf=new int[n];
        pre[0]=nums[0];
        for(int i=1;i<n;i++){
            pre[i]=nums[i]+pre[i-1];
        }
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i]=nums[i]+suf[i+1];
        }
        for(int i=0;i<n;i++){
            int lsum = (i == 0) ? 0 : pre[i - 1]; 
            int rsum = (i == n - 1) ? 0 : suf[i + 1];
            if(lsum==rsum){
                return i;
            }
        }
        return -1;
    }
}