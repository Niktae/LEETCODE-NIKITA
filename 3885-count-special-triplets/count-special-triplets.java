/*class Solution {
    public int specialTriplets(int[] nums) {
        final long MOD=1000000007L;
        long ans=0;
        Map<Integer,Long>left=new HashMap<>();
        Map<Integer,Long>right=new HashMap<>();
        for(int num:nums){
            right.put(num,right.getOrDefault(num,0L)+1);
        }
        //remove j from right as j is like middle element
        for(int j=0;j<nums.length;j++){
            right.put(nums[j],right.get(nums[j])-1);
            if(right.get(nums[j])==0) {
                right.remove(nums[j]);
            }
            int target=2*nums[j];
            long lcnt=left.getOrDefault(target,0L);
            long rcnt=right.getOrDefault(target,0L);
            ans+=((lcnt*rcnt)%MOD)%MOD;
            //Now put j in left
            left.put(nums[j],left.getOrDefault(nums[j],0L)+1);
        }
        return (int)(ans%MOD);

    }
}*/
class Solution {

    public int specialTriplets(int[] nums) {
        final int MOD = 1000000007;
        Map<Integer, Integer> numCnt = new HashMap<>();
        Map<Integer, Integer> numPartialCnt = new HashMap<>();

        for (int v : nums) {
            numCnt.put(v, numCnt.getOrDefault(v, 0) + 1);
        }

        long ans = 0;
        for (int v : nums) {
            int target = v * 2;
            int lCnt = numPartialCnt.getOrDefault(target, 0);
            numPartialCnt.put(v, numPartialCnt.getOrDefault(v, 0) + 1);
            int rCnt =
                numCnt.getOrDefault(target, 0) -
                numPartialCnt.getOrDefault(target, 0);
            ans = (ans + (long) lCnt * rCnt) % MOD;
        }

        return (int) ans;
    }
}