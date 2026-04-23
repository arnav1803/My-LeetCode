import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        
        Map<Integer, List<Integer>> indicesMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indicesMap.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        
        for (List<Integer> indices : indicesMap.values()) {
            int size = indices.size();
            
            if (size == 1) {
                continue;
            }
            
            long totalSum = 0;
            for (int index : indices) {
                totalSum += index;
            }
            
            long leftSum = 0;
            
            for (int i = 0; i < size; i++) {
                long currentIndex = indices.get(i);
                long rightSum = totalSum - leftSum - currentIndex;
                
                long leftCount = i;
                long rightCount = size - 1 - i;
                
                long leftDist = (currentIndex * leftCount) - leftSum;
                long rightDist = rightSum - (currentIndex * rightCount);
                
                arr[(int) currentIndex] = leftDist + rightDist;
                leftSum += currentIndex;
            }
        }
        
        return arr;
    }
}