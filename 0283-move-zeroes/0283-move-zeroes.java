import java.util.*;
class Solution {
    public void moveZeroes(int[] nums) {
        int count=0;
        int num[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0){
                num[count]=nums[i];
                count++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i<count){
                nums[i]=num[i];
            }else{
                nums[i]=0;
            }
        }
    }
    
}