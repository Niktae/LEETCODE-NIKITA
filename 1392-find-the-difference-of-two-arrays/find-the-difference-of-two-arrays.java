class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> diff=new ArrayList<>();
        List<Integer> d1=new ArrayList<>();
        List<Integer> d2=new ArrayList<>();
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        HashSet<Integer> h3=new HashSet<>();
        HashSet<Integer> h4=new HashSet<>();
        for(int i:nums1){
            h1.add(i);
        }
        for(int i:nums2){
            h2.add(i);
        }
        for(int i:nums1){
            if(!h2.contains(i)){
                h3.add(i);
            }
        }
        for(int i:nums2){
            if(!h1.contains(i)){
                h4.add(i);
            }
        }
        for(int i:h3){
            d1.add(i);
        }
        for(int i:h4){
            d2.add(i);
        }
        diff.add(d1);
        diff.add(d2);
        return diff;
    }
}