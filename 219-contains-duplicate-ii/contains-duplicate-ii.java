class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i]) && i-hm.get(nums[i])<=k){
                return true;
            }
            hm.put(nums[i],i);
        }
        return false;
    }
}//You are iterating from left to right.The map stores previous index.
//So i - previousIndex is always ≥ 0,Thus Math.absis not neccessay here