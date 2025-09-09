public class Solution {
    public int CountSubarrays(int[] nums) {
        int n=nums.Length;
        int cnt=0;
        for(int i=0;i<=n-3;i++){
            int j=i+2;
            int k=j-1;
            if((nums[i]+nums[j])*2==nums[k]){
                cnt++;
            }
        }
        return cnt;   
    }
}