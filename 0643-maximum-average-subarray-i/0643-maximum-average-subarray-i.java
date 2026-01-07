class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double avgsum=0;int i=0;
        for(i=0;i<k;i++){
            avgsum+=arr[i];
        }
        double maxsum=avgsum;
        for(i=k;i<arr.length;i++){
            avgsum=avgsum-arr[i-k]+arr[i];
            if(avgsum>maxsum){maxsum=avgsum;}
        }
        return maxsum/k;
    }
}