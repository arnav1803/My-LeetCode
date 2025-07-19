class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count1=0;
        int count2=0;
        for(int i=0;i<nums1.length;i++){
            count1++;
        }
        for(int i=0;i<nums2.length;i++){
            count2++;
        }
        int m=0;int n=0;int k=0;
        int [] arr =new int[count1+count2];
        while(m<count1 && n<count2){
            if(nums1[m]>nums2[n]){
                arr[k]=nums2[n];
                k++;n++;
            }else{
                arr[k]=nums1[m];
                k++;m++;
            }
        }
        while(m!=count1){
           arr[k]=nums1[m];
            k++;m++; 
        }
        while(n!=count2){
           arr[k]=nums2[n];
            k++;n++; 
        }
        int med=0;
        if(k%2==0){
            med=(k+1)/2;
            return ((arr[med]+arr[med-1])/2.0);
        }
        else{
            return(arr[k/2]);
        }
    }
}