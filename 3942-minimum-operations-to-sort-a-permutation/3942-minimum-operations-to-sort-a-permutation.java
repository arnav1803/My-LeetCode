class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, s = nums[0];
        int count1 = Integer.MAX_VALUE;
        int count2 = Integer.MAX_VALUE;
        int count3 = Integer.MAX_VALUE;
        int count4 = Integer.MAX_VALUE;

        if (isAsc(nums)) {
            count2 = (n - s) % n;
            count4 = s + 2;
        }
        if (isDesc(nums)) {
            count1 = 1 + (n - s - 1) % n;
            count3 = (s + 1) % n + 1;
        }

        int ans = Math.min(Math.min(count1, count2), Math.min(count3, count4));
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else
            return ans;
    }

    public boolean isAsc(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            if (nums[i] != (nums[0] + i) % n) return false;
        return true;
    }

    public boolean isDesc(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++)
            if (nums[i] != ((nums[0] - i) % n + n) % n) return false;
        return true;
    }
}