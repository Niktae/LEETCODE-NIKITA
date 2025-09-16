public class Solution {
    public int[] TwoSum(int[] nums, int target) {
        int[] ans=new int[2];
        Dictionary<int,int>dict=new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
            if(dict.ContainsKey(target-nums[i])){
                ans[0]=i;
                ans[1]=dict[target-nums[i]];
            }
            dict[nums[i]]=i;
        }
        return ans;
    }
}