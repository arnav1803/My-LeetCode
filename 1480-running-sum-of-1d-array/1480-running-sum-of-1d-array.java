class Solution {
    public int[] runningSum(int[] nums) {
        int arr[]= new int[nums.length];
        int temp=0;
        for(int i=0;i<nums.length;i++){
            arr[i]= temp+nums[i];
            temp=arr[i];
        }
        return arr;
    }
}