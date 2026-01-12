class Solution {
    public int mostFrequentEven(int[] nums) {
                Map<Integer, Integer> freq = new HashMap<>();

        // Count frequency of even numbers
        for (int num : nums) {
            if (num % 2 == 0) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
        }

        // If no even elements
        if (freq.isEmpty()) return -1;

        int maxFreq = 0;
        int result = Integer.MAX_VALUE;

        // Find most frequent even element
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();

            if (count > maxFreq || 
               (count == maxFreq && num < result)) {
                maxFreq = count;
                result = num;
            }
        }

        return result;

    }
}