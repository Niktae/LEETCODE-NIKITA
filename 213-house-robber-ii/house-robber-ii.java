class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (n==1) return nums[0];
        return Math.max(rob(nums,0,n-2),rob(nums,1,n-1));
    }
    private int rob(int[] num, int lo, int hi) {
    int include = 0, exclude = 0;
    for (int j = lo; j <= hi; j++) {
        int i = include, e = exclude;
        include = e + num[j];
        exclude = Math.max(e, i);
    }
    return Math.max(include, exclude);
    }
}