class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0) {
                map.put(nums2[i], map.get(nums2[i]) - 1);
            } else {
                nums2[i] = -1;
            }
        }

        int size = 0;
        for (int num : nums2) {
            if (num != -1) {
                size++;
            }
        }

        int[] arr = new int[size];
        int i = 0;

        for (int num : nums2) {
            if (num != -1) {
                arr[i++] = num;
            }
        }

        return arr;
    }
}