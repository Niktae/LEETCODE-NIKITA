class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0,r=0,max=0;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0){
                l=r+1;
            }
            r++;
            max=Math.max(max,r-l);
        }
        return max;
    }
}