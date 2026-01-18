import java.util.*; 
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        ArrayList<Integer> list= new ArrayList<>();
        int n=nums.length;
        for(int x:nums){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }
            else{
                map.put(x,1);
            }
        }
        for(int x:map.keySet()){
            if(map.get(x)>n/3){
                list.add(x);
            }
        }
        return list;
    }
}