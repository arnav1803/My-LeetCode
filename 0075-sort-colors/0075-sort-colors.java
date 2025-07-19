class Solution {
    
    public void sortColors(int[] nums) {
        
        for(int i=0;i<nums.length-1;i++){
            int flag=0;
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    flag=1;
                }
            }
            if(flag==0){
                 return ;
            }            
        }
    }
}