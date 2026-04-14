class Solution {
    public int searchInsert(int[] nums, int x) {
        int left = 0, right = nums.length - 1;

        while(left<=right){
            int mid= (left+ right)/2;
            if(nums[mid]<x){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        
        return left;
    }
}