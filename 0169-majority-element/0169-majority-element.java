import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
      HashMap<Integer,Integer> map= new HashMap<>();
      int n=nums.length;
      for(int x:nums){
        if(map.containsKey(x)){
            map.put(x,map.get(x)+1);
        }
        else{
            map.put(x,1);
        }
        if(map.get(x)>n/2){
            return x;
        }
      }
      return -1;
    }
}