class Solution {
    public int longestSubarray(int[] nums) {
        /*int l=0,r=0,max=0,len=0,cnt0=0;
        while(r<nums.length){
            if(nums[r]==0 && nums[r+1]==1){
                cnt0++;
                l=r+1;
            }
            len=r-l+1;
            max=Math.max(len,max);
            r++;
        }
        if(max==nums.length)return max-1;
        return max;*/
        int l=0,r=0,zeroes=0,len=0,maxlen=0,k=1;
        int n=nums.length;
        while(r<n){
            if(nums[r]==0)zeroes++;
            if(zeroes>k){
                if(nums[l]==0)zeroes--;
                l++;
            }
            if(zeroes<=k){
                len=r-l+1;
                maxlen=Math.max(len,maxlen);
            }
            r++;
        }
        return maxlen-1;
        
    }
}