class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[k];
        Map<Integer,Integer>hm=new TreeMap<>();
        for(int num:nums){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        //for(Map.Entry<Integer,Integer>entry:hm.entrySet())
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(hm.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));
        for(int i=0;i<k && i<list.size();i++){
            ans[i]=list.get(i).getKey();
        }

        return ans;
    }
}