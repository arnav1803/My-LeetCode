import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        
        // Step 1: Group indices by their values in nums
        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indicesMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        // Step 2: Calculate the sum of distances for each group
        for (List<Integer> indices : indicesMap.values()) {
            int size = indices.size();
            
            // If a number only appears once, its distance sum is 0 (default in array)
            if (size == 1) {
                continue;
            }
            
            // Find the total sum of all indices in this group
            long totalSum = 0;
            for (int index : indices) {
                totalSum += index;
            }
            
            long leftSum = 0;
            
            for (int i = 0; i < size; i++) {
                long currentIndex = indices.get(i);
                
                // The sum of all indices to the right of the current index
                long rightSum = totalSum - leftSum - currentIndex;
                
                // Number of elements to the left and right
                long leftCount = i;
                long rightCount = size - 1 - i;
                
                // Apply the mathematical formula for absolute differences
                long leftDist = (currentIndex * leftCount) - leftSum;
                long rightDist = rightSum - (currentIndex * rightCount);
                
                // The total distance is the sum of left and right distances
                arr[(int) currentIndex] = leftDist + rightDist;
                
                // Add the current index to the leftSum for the next iteration
                leftSum += currentIndex;
            }
        }
        
        return arr;
    }
}