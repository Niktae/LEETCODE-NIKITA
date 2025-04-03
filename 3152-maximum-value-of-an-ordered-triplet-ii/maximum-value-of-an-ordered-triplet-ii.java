class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;  if (n < 3) return 0;
        long maxLeft = nums[0];
        long maxProd = 0;
        long maxDiff = Integer.MIN_VALUE;
        for(int i=1;i<n-1;i++){
            maxDiff=Math.max(maxDiff,maxLeft-nums[i]);
            maxProd=Math.max(maxProd,maxDiff*(long)nums[i+1]);
            maxLeft=Math.max(maxLeft,nums[i]);
        }
        return maxProd;
    }
}