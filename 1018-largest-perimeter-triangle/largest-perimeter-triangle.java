class Solution {
    public int largestPerimeter(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0,max=0;
        for(int i=n-1;i>=2;i--){
            if(nums[i]<nums[i-1]+nums[i-2]){
            sum=nums[i]+nums[i-1]+nums[i-2];
            max=Math.max(max,sum);
            }
        }
        if(max>0)return max;
        return 0;
    }
}