class Solution {
    public int findMin(int[] arr) {
        
        int low = 0, high = arr.length-1;
        if(arr[low]<arr[high]){
                return arr[low];
            }
        while (low < high) {
           
            if(arr[low]<arr[high]){
                return arr[low];
            }
            int mid= low+(high-low)/2;
            if(arr[mid]<arr[low]){
                high=mid;
            }
            else {
                low=mid+1;
            }
        }

        return arr[low];
    }
}