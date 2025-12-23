class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String>ls=new ArrayList<>();
        if(nums.length==0) return ls;
        int a=nums[0];
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i]!=nums[i-1]+1){
                int b=nums[i-1];
                if(a==b){
                    ls.add(String.valueOf(a));
                }
                else{
                    ls.add(a+"->"+b);
                }
                if(i<nums.length)a=nums[i];
            }
        }
        return ls;
    }
}