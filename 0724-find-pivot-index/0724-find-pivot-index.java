class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        // for each index, calculate left sum and right sum separately
        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // compute left sum
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            // compute right sum
            for (int j = i + 1; j < n; j++) {
                rightSum += nums[j];
            }

            // check if pivot
            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}