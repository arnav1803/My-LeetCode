class Solution {
    public void rotate(int[] nums, int k) {
        int num[]=new int[nums.length];k=k%nums.length;
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=num[(i-k+nums.length)%nums.length];
        }
    }
}