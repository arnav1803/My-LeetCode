class Solution {
    public int maxProfit(int[] nums) {
        int min=Integer.MAX_VALUE;int max=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i]-min,max);
        }
        return max;
    }
}