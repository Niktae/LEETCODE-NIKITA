class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int max=0,l=0,r=0;
        HashMap<Integer,Integer>hm=new HashMap<>();
        while(r<n){
            hm.put(fruits[r],hm.getOrDefault(fruits[r],0)+1);
                while(hm.size()>=3){
                    hm.put(fruits[l],hm.get(fruits[l])-1);
                    if(hm.get(fruits[l])==0)hm.remove(fruits[l]);
                    l++;
                }
                max=Math.max(max,r-l+1);
                r++;
        }
        return max;
    }
}