class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;

        for(int pile : piles){
            high = Math.max(high, pile);
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high - low) / 2;

            long hours = 0;

            for (int p : piles){
                hours += (p + mid - 1) / mid;
            }

            if(hours <= h){ // correct speed check a more optimal speed
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}