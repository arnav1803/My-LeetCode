class Solution {
    public int[] dailyTemperatures(int nums[]) {
        int n=nums.length;
        int res[]= new int[nums.length];
        Stack<Integer> st= new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                res[i]=0;
            }
            else{
                res[i]= st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}