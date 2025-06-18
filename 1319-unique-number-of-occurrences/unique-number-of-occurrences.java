class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        Set<Integer>freqSet=new HashSet<>();
        for(int freq:hm.values()){
            if(!freqSet.add(freq)) return false;
        }
        return true;
    }
}