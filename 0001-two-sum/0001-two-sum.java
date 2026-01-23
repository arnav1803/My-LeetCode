import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // Find the required complement
            // If complement exists in map, return indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Store the current number and its index
            map.put(nums[i], i);
        }
        // Return empty array if no solution (shouldn't happen per problem statement)
        return new int[] {};
    }
}
