class Solution {
    public int hIndex(int[] nums) {
        int low=0;int high=nums.length-1;
        while(low<=high){
            int mid=(high+low)/2;
            if (nums[mid]>=nums.length-mid){
                high=mid-1;
            }else low=mid+1;
        }
        return nums.length-low;
    }
}