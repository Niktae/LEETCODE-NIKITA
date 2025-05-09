class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        List<Integer> res=new ArrayList<>();
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[nums[i]]=nums[i];
        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                res.add(i);
            }
        }
        return res;
    }
}