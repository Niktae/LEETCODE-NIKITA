class Solution {
    public int jump(int[] nums) {
        int max=0,l=0,r=0,jump=0;
        while(r<nums.length-1){
            for(int i=l;i<=r;i++){
                max=Math.max(max,i+nums[i]);
            }
                l=r+1;
                r=max;
                jump+=1;
        }
        return jump;
    }
}