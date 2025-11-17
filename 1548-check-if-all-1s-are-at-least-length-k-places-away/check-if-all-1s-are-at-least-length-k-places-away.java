class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int i=0,j=i+1;
        int n=nums.length;
        while(j<n && i<j){
            if(nums[i]==1 && nums[j]==0){
                j++;
            }
            else if(nums[i]==1 && nums[j]==1){
                if(j-i-1<k) return false;
                i=j;
                j++;
            }
            else{
                i++;
                j++;
            }
            
        }
        return true;
    }
}