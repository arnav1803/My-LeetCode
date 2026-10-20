class Solution {
    public int sortableIntegers(int[] nums) {
        ArrayList<Integer> k = new ArrayList<>();
        int n = nums.length;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                k.add(i);
            }
        }
        if (k.isEmpty()) {
            return 0;
        }
        int sorted[] = nums.clone();
        Arrays.sort(sorted);
        int ans=0;
        for (int i = 0; i < k.size(); i++) {
            int size = k.get(i);
            boolean flag = true;

            for (int j = 0; j < n; j += size) {
                int temp[] = Arrays.copyOfRange(nums, j, j + size);
                int target[] = Arrays.copyOfRange(sorted, j, j + size);
                if (!cyclicsort(temp,target)) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                ans += size;
            }
        }
        return ans;
    }

    public boolean cyclicsort(int[] nums, int[] sorted) {
    int n = nums.length;

    int lps[] = new int[n];
    int len = 0;

    for (int i = 1; i < n; ) {
        if (sorted[i] == sorted[len]) {
            lps[i++] = ++len;
        } else if (len > 0) {
            len = lps[len - 1];
        } else {
            lps[i++] = 0;
        }
    }

    int i = 0, j = 0;

    while (i < 2 * n - 1) {
        if (nums[i % n] == sorted[j]) {
            i++;
            j++;

            if (j == n) {
                return true;
            }
        } else if (j > 0) {
            j = lps[j - 1];
        } else {
            i++;
        }
    }

    return false;
}
}