class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int prefix[]=new int[n+1];
        prefix[0]=0;
        int max=0;
        for(int i=1;i<prefix.length;i++){
            prefix[i]=gain[i-1]+prefix[i-1];
        }
        for(int i=0;i<prefix.length;i++){
            if(prefix[i]>max){
                max=prefix[i];
            }
        }
        return max;
    }
}