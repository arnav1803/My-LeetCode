class Solution {
    public void reverseString(char[] s) {
        String s1= new String(s);
        StringBuilder sb= new StringBuilder(s1);
        char arr[]= (sb.reverse().toString()).toCharArray();
        for(int i=0;i<s.length;i++){
            s[i]=arr[i];
        }
    }
}