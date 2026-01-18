import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        
        for(int x:nums){
            if(!list.contains(x)){
                list.add(x);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}