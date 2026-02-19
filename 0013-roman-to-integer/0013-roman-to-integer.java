class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            if(i<s.length()-1 && s.charAt(i)=='I'&& s.charAt(i+1)=='V'){
                i++;
                ans+=4;
            }
            else if(i<s.length()-1 &&s.charAt(i)=='I'&& s.charAt(i+1)=='X'){
                i++;
                ans+=9;
            }
            else if(i<s.length()-1 &&s.charAt(i)=='X'&& s.charAt(i+1)=='L'){
                i++;
                ans+=40;
            }
            else if(i<s.length()-1 &&s.charAt(i)=='X' && s.charAt(i+1)=='C'){
                i++;
                ans+=90;
            }
            else if(i<s.length()-1 &&s.charAt(i)=='C' && s.charAt(i+1)=='D'){
                i++;
                ans+=400;
            }
            else if(i<s.length()-1 &&s.charAt(i)=='C'&& s.charAt(i+1)=='M'){
                i++;
                ans+=900;
            }
            else if(s.charAt(i)=='I'){
            ans+=1;}
            else if(s.charAt(i)=='V')
            ans+=5;
            else if(s.charAt(i)=='X')
            ans+=10;
            else if(s.charAt(i)=='L')
            ans+=50;
            else if(s.charAt(i)=='C')
            ans+=100;
            else if(s.charAt(i)=='D')
            ans+=500;
            else if(s.charAt(i)=='M')
            ans+=1000;
        }
        return ans;
    }
}