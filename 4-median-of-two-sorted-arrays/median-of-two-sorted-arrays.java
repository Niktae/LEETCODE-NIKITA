class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int k=m+n;
        int arr[]=new int[k];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<m;i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);
        if(k%2!=0){
            return (float)arr[k/2];
        }
        return (arr[k/2]+arr[k/2-1])/2.0;
    }
}