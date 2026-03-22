class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store number -> index
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // If complement already exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
            // Otherwise, store current number with its index
            map.put(nums[i], i);
        }
        
        // If no solution found (though problem guarantees one)
        return new int[] {};
    }
}