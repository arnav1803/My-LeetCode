class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int[] differenceArray = new int[102];
      
        // Mark the start and end of each interval using difference array technique
        for (List<Integer> interval : nums) {
            int startPoint = interval.get(0);
            int endPoint = interval.get(1);
          
            // Increment at start point (interval begins)
            differenceArray[startPoint]++;
            // Decrement after end point (interval ends)
            differenceArray[endPoint + 1]--;
        }
      
        // Count the number of points covered by at least one interval
        int totalCoveredPoints = 0;
        int currentOverlapCount = 0;
      
        // Sweep through all points and accumulate the difference values
        for (int difference : differenceArray) {
            // Update the current overlap count
            currentOverlapCount += difference;
          
            // If current point is covered by at least one interval, count it
            if (currentOverlapCount > 0) {
                totalCoveredPoints++;
            }
        }
      
        return totalCoveredPoints;
    }
}