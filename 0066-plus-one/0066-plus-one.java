import java.math.*;
class Solution {
    public int[] plusOne(int[] nums) {
        BigInteger num = BigInteger.ZERO;int i=0;
        for(i =0;i<nums.length;i++){
           num = num.multiply(BigInteger.TEN)
                     .add(BigInteger.valueOf(nums[i]));
        }
        num = num.add(BigInteger.ONE);
         String s = num.toString();
        int[] RetArr = new int[s.length()];
        for (i = 0; i < s.length(); i++) {
            RetArr[i] = s.charAt(i) - '0';
        }
        return RetArr;
    }
}