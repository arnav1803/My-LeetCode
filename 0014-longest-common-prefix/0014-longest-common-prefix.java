class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Iterate through each character of the first string
        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);

            // Compare this character with the same index in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If index 'i' exceeds the length of the current string
                // or the characters don't match, return the prefix found so far
                if (i == strs[j].length() || strs[j].charAt(i) != c) {
                    return strs[0].substring(0, i);
                }
            }
        }
        
        return strs[0];
    }
}