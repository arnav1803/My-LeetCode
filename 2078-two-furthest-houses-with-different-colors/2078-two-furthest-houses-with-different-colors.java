class Solution {
    public int maxDistance(int[] nums) {
        int max=0;int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[n-1]){
                max=Math.max(max,n-1-i);
            }
            if(nums[i]!=nums[0]){
                max=Math.max(max,i);
            }
        }
        return max;
    }
}