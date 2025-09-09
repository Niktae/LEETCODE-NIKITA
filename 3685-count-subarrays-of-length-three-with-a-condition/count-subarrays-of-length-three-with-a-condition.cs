public class Solution {
    public int CountSubarrays(int[] nums) {
        int n=nums.Length;
        int cnt=0;
        for(int i=0;i<=n-3;i++){
            if((nums[i]+nums[i+2])*2==nums[i+1]){
                cnt++;
            }
        }
        return cnt;   
    }
}