class Solution {
    public String findValidPair(String s) {
        int[] freq = new int[10];

        // Step 1: Count frequency of each digit
        for (char c : s.toCharArray()) {
            freq[c - '0']++;
        }

        // Step 2: Traverse adjacent pairs
        for (int i = 0; i < s.length() - 1; i++) {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);

            int da = a - '0';
            int db = b - '0';

            // Conditions
            if (a != b &&
                freq[da] == da &&
                freq[db] == db) {
                return "" + a + b;
            }
        }

        return "";
    }
}
