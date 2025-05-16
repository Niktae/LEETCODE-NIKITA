class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=k;
        double sum=0;
        for(int i=l;i<r;i++){
            sum+=nums[i];
        }
        double avg=sum/k;
        double max=avg;
        while(r<nums.length){
            sum-=nums[l];
            sum+=nums[r];
            l++;
            r++;
            avg=sum/k;
            max=Math.max(max,avg);
        }
        return max;
    }
}