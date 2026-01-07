class Solution {
    public int lengthOfLongestSubstring(String str) {
        HashSet<Character> set=new HashSet<>();
        int left=0;
        int right=0;int maxLen=0;int curr=0;

        for(right=0;right<str.length();right++){
            char ch=str.charAt(right);

        if(!set.contains(ch)){
            maxLen = Math.max(maxLen, right - left + 1);
            set.add(ch);
        }
        else{
            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }set.add(ch);
        }

        }
        return maxLen;
    
    }
}