class Solution {
    public int findFinalValue(int[] nums, int original) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original){
                original=2*original;
                System.out.println( original+" ");
                i=-1;
               // continue;
            }
        }
        return original;
    }
}