class Solution {
    public String reverseWords(String s) {
        s=s.trim(); StringBuilder ans=new StringBuilder();int left=0;
        StringBuilder sb= new StringBuilder(s);
        sb.reverse(); char []ch=sb.toString().toCharArray();
        for(int i=0;i<=ch.length;i++){
            if(i==ch.length || ch[i]==' '){
                if(i > left){
                    String temp= sb.toString().substring(left,i);
                    StringBuilder sb1=new StringBuilder(temp);
                    temp=sb1.reverse().toString();
                    ans.append(temp);
                    ans.append(" ");}
                left=i+1; 
            }
        }
        return ans.toString().trim();
    }
}