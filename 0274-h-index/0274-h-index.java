class Solution {
    public int hIndex(int nums[]) {
        int count = 0;
        for (int i = 0; i <= nums.length; i++) {
            int temp = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] >= i) {
                    temp++;
                }
            }
            if (temp >= i) {
                    count = i;
                }
        }
        return count;
    }
}