class Solution {
    public int search(int[] nums, int x) {
        int left=0; int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{right=mid;}

        }
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[(i+left)%nums.length];
        }
        int l=left;int r=nums.length-1; left=0; right= r;
                while(left<=right){
            int mid=left+(right-left)/2;
             if (arr[mid]==x) {
                return (mid+l)%nums.length;}
            else if(arr[mid]<x){
                left=mid+1;
            }
            else {
            right=mid-1;
            }
        

        }
        return -1;
    }
}