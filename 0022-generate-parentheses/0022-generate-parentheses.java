class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> st= new ArrayList<>();
        helper(n,n,"",st,n);
        return st;
    }
    public static void helper(int m, int n,String s, List<String> st,int size){
        if (s.length()==size*2) {
            st.add(s);
            return;
        }
        if(m>0){
            helper(m-1,n,s+"(",st,size);
        }
        if(n>m){
            helper(m,n-1,s+")",st,size);
        }
    }
}