class Solution {
    public String addSpaces(String s, int[] spaces) {
         int ss= spaces.length; int j=0;int flag=0;
        StringBuilder str= new StringBuilder();
        for(int i=0;i<s.length();i++){
            flag=0;
              if (j<ss&&i==spaces[j]) {
                flag=1;
                j++;
            }

            if (flag==1) {
                str.append(" ");
            }

            str=str.append(s.charAt(i));}
        
        return str.toString();
    }
}