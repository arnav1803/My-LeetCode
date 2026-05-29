class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                temp++;
            } else {
                if (nums[i] == nums[i - 1]) {
                    continue;
                } else if (nums[i] == 1 + nums[i - 1]) {
                    temp++;
                } else {
                    temp = 1;
                }
            }
            ans = Math.max(ans, temp);
        }
        return ans;
    }
}