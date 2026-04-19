class Solution {
    public int maxDistance(int[] nums1, int[] nums2) {
        int max=0;int j=0;int i=0;
            while(j<nums2.length&&i<nums1.length){
                if(nums2[j]>=nums1[i])
                {
                max=Math.max(max,j-i);j++;}
                else {i++;}
            }
        return max;
    }
}