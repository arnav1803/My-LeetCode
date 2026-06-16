class Solution {
    public int[] decrypt(int[] nums, int k) {
        int sol[]=new int[nums.length];
        if(k==0){
            return sol;
        } 
        for(int i=0;i<nums.length;i++){
            if(k>0){
                for(int j=i+1;j<i+k+1;j++){
                   sol[i]+= nums[j%nums.length];
                }
            }
            if(k<0){
                for(int j=i-1;j>=i+k;j--){
                    sol[i]+=nums[(j+nums.length)%nums.length];
                }
            }
        }
        return sol;
    }
}