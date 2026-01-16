import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        int slow=square(n);
        int fast=square(slow);

        while(slow!=fast){
            slow=square(slow);
            fast=square(square(fast));
        }
        return slow==1;
        
    }
    public static int square(int n){
        int sum=0;
        while(n!=0){
            int temp = n % 10;
            n /= 10 ;
             sum+=temp*temp;
        }
        return sum;
    }
}