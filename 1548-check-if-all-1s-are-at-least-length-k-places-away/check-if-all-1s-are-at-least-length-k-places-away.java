class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev1=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(prev1!=-1 && i-prev1-1<k) return false;
                prev1=i;
            }
        }
        return true;
    }
}