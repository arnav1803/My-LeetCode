class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        int ans=0;
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==2){
                ans^=entry.getKey();
            }
        }
        return ans;
    }
}