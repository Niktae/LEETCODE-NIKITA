class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashSet<Integer>hs=new HashSet<>();
        for(int num:arr){
            hs.add(num);
        }
        int cnt=0,num=1;
        while(true){
            if(!hs.contains(num)){
                cnt++;
                if(cnt==k) return num;
            }  
            num++;
        }      
    }
}