class Solution {
    public boolean isTrionic(int[] nums) {
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(flag==2){
                if(nums[i]<nums[i+1]){
                    continue;
                }else{
                    return false;
                }
            }
            if(flag==1){
                if(nums[i]>nums[i+1]){
                    continue;
                }
                else if(nums[i]<nums[i+1]){
                    flag=2;
                }
                else{
                    return false;
                }
            }
            if(flag==0){
                if(nums[i]<nums[i+1]) {
                    continue;
                } 
                else if(nums[i] > nums[i+1]) {
                    flag=1;
                } 
                else {
                    return false;
                }
            }
        }
        return flag==2 && nums[0] < nums[1];
        // increasing 
        //decreasing
        //increasing}

    }
}