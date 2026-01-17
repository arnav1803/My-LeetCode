class Solution {
    public boolean isUgly(int n) {
        boolean bool=true;
        if(n <= 0) return false; 
        if(n==1){
         return true;}
        if(n%2==0 || n%3==0 || n%5==0){
            while(bool){
                if(n%2==0){
                    n/=2;
                }
                else if(n%3==0){
                    n/=3;
                }
                else if(n%5==0){
                    n/=5;
                }
                else bool=false;
                }
            
        }
        else {return false;}
        return n==1;
    }
}