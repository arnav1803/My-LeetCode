class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;int right=0; int len=Integer.MAX_VALUE;int ans=0;
        for(right=0;right<nums.length;right++){
           ans+=nums[right];
            while(ans>=target){
               len=Math.min(len,right-left+1);
               ans-=nums[left];
               left++;

            }
        }
        if(len==Integer.MAX_VALUE){
            return 0;
        }
        else return len;
    }
}