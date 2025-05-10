class Solution {
    public int maxProduct(int[] nums) {
        //better or brute force approach
        int n= nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int prod=1;
            for(int j=i;j<n;j++){
                prod*=nums[j];
                max=Math.max(max,prod);
            }
        }
        return max;
        
    }
}