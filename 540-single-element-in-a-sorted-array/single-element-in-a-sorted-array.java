class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int a=0;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2])return nums[n-1];
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1] && nums[i]!=nums[i-1]){
                  a=nums[i];
            }
        }
        return a ;
    }
}